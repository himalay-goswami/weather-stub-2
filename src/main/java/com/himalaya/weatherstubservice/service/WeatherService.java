package com.himalaya.weatherstubservice.service;

import com.himalaya.weatherstubservice.entity.Weather;
import com.himalaya.weatherstubservice.repository.WeatherDataRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
@EnableAsync
public class WeatherService {

    private final WeatherDataRepository weatherDataRepository;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");


    public WeatherService(WeatherDataRepository weatherDataRepository) {
        this.weatherDataRepository = weatherDataRepository;
    }
    private double generateTemperature(){
        int max = 35;
        int min = 15;
        return Math.floor(Math.random()*(max-min+1)+min);
    }


    @Async
    @Scheduled(fixedRate = 10000)
    public void saveWeatherData(){
        Weather weather = new Weather();
        weather.setLocation("pune");
        weather.setTemperature(generateTemperature());

        weather.setTimeStamp(dateTimeFormatter.format(LocalTime.now()));
        weatherDataRepository.save(weather);
    }

    public Weather getLatestData() {
        return weatherDataRepository.findTopByOrderByIdDesc();
    }

}
