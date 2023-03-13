package com.himalaya.weatherstubservice.Controller;

import com.himalaya.weatherstubservice.entity.Weather;
import com.himalaya.weatherstubservice.service.WeatherService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherServiceController {

    private final WeatherService weatherService;

    public WeatherServiceController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/1")
    public String getData(){
        return "Data taken. Thanks.";
    }

    @QueryMapping
    public Weather getWeatherData(){
        return weatherService.getLatestData();
    }

    @GetMapping("/latestData")
    public Weather getLatestData(){
        return weatherService.getLatestData();
    }

    @GetMapping("/latestTemp")
    public double getLatestTemp(){
        return weatherService.getLatestData().getTemperature();
    }

}
