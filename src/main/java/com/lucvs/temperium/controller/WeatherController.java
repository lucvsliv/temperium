package com.lucvs.temperium.controller;

import com.lucvs.temperium.service.WeatherApiService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherApiService weatherApiService;

    public WeatherController(WeatherApiService weatherApiService) {
        this.weatherApiService = weatherApiService;
    }

    @GetMapping("/test")
    public ResponseEntity<String> testWeather() {
        String weatherJson = weatherApiService.getCurrentWeather(60, 127);
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(weatherJson);
    }
}
