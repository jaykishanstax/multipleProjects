package com.interview.demo.service;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserService {

/*
    @Autowired
    private WeatherService weatherService;
*/

    /*@Autowired
    ApplicationContext applicationContext;

    // egar initialize
    @Autowired
    ObjectFactory<WeatherService> weatherServiceObjectFactory;
*/
    @Lookup
    // spring use cgb lib, which dynamically fill this - dynamic proxy
    // bean should not be final - WeatherService should not be final
    // below method should not be private, static or final
    public WeatherService getWeatherServiceBean(){
        return null;
    }


    public String getCurrentTempFromWeatherApi(){
//        return weatherService.getCurrentTemp();

        //return applicationContext.getBean(WeatherService.class).getCurrentTemp();

       // return weatherServiceObjectFactory.getObject().getCurrentTemp();

        return getWeatherServiceBean().getCurrentTemp();
    }

}
