package com.academy.natalia.nataliaHomework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] cars = CarGenerator.CarGeneration(10);
        cars[0].setDoors(5);
        cars[1].setDoors(2);
        cars[3].setDoors(4);
        cars[4].setDoors(2);
        cars[5].setDoors(4);
        Arrays.sort(cars);
            for (Car car : cars) { System.out.println(car.toString());
            car.run();
            car.move();
        }
    }
}
