package com.himalaya.weatherstubservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @GeneratedValue
    private String timeStamp;
    private String location;
    private double temperature;
}
