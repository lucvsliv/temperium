package com.lucvs.temperium.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tempino")
public class Tempino {

    // fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 30)
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "weather_type", nullable = false, length = 20)
    private String weatherType;

    @Column(name = "image_url", length = 255)
    private String imageUrl;

    // constructor
    public Tempino() {}

    public Tempino(String name, String description, String weatherType, String imageUrl) {
        this.name = name;
        this.description = description;
        this.weatherType = weatherType;
        this.imageUrl = imageUrl;
    }

    // getter/setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getWeatherType() { return weatherType; }
    public void setWeatherType(String weatherType) { this.weatherType = weatherType; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
