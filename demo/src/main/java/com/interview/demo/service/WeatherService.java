package com.interview.demo.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Random;

@Service
@Scope("prototype")
public class WeatherService {

    String time = LocalTime.now().toString();
    int temp = new Random().nextInt(60);


    public String getCurrentTemp() {
        return time + " -> " + temp;
    }
}
