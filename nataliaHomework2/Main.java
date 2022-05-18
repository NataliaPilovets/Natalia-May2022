package com.nataliaHomework2;

import java.util.Arrays;

/*Метод Arrays.sort() позволяет сортировать элементы массива по возрастанию
* Обратите внимание, что мы можем использовать Arrays.sort(T[] tArr) только если тип массива реализует интерфейс Comparable.
*  Comparable<Car> */

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
