package org.example;

import org.example.BuilderPattern.House;
import org.example.SingletonPattern.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("This is a log message");

        House house = new House.Builder()
                .setRooms(3)
                .setFloors(2)
                .setPool(true)
                .setGarage(false)
                .build();
        System.out.println(house);

    }
}