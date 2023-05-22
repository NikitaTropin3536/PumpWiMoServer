package com.app.pumpwimo.pumpwimoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// этот класс - входная точка для разворачивания spring boot приложения
public class PumpWiMoApiApplication {
    public static void main(String[] args) {
        /*
        1097 строчек - humans,
        ? строчек - movies,
        ? строчек - quests,
        */
        SpringApplication.run(PumpWiMoApiApplication.class, args);
    }
}