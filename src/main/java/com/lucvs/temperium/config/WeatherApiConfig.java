package com.lucvs.temperium.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "weather.api")
public class WeatherApiConfig {
    private String key;
    private String url;

    // getter/setter
    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
