package com.himalaya.weatherstubservice.graphql;

import com.himalaya.weatherstubservice.entity.Weather;
import com.himalaya.weatherstubservice.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query {

    @Autowired
    private WeatherService weatherService;

    public Weather getWeatherData(){
        return weatherService.getLatestData();
    }
}
