package com.himalaya.weatherstubservice.repository;

import com.himalaya.weatherstubservice.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface WeatherDataRepository extends JpaRepository<Weather, Integer> {

    Weather findTopByOrderByIdDesc();
}
