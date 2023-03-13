package com.himalaya.weatherstubservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WeatherStubServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherStubServiceApplication.class, args);
    }
}
