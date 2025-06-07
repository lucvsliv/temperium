package com.lucvs.temperium.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WeatherApiServiceImpl implements WeatherApiService {

    @Value("${weather.api.key}")
    private String serviceKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    /**
     * 초단기실황
     */
    @Override
    public String getCurrentWeather(int nx, int ny) {
        WebClient client = WebClient.create(apiUrl);

        String today = java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.BASIC_ISO_DATE);
        String baseTime = getBaseTime();

        return client.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/getUltraSrtNcst")
                        .queryParam("serviceKey", serviceKey)
                        .queryParam("pageNo", 1)
                        .queryParam("numOfRows", 1000)
                        .queryParam("dataType", "JSON")
                        .queryParam("base_date", today)
                        .queryParam("base_time", baseTime)
                        .queryParam("nx", nx)
                        .queryParam("ny", ny)
                        .build())
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    private String getBaseTime() {
        java.time.LocalTime now = java.time.LocalTime.now();
        int hour = now.getMinute() < 40 ? now.getHour() - 1 : now.getHour();
        if (hour < 0) hour = 23;
        return String.format("%02d00", hour);
    }
}
