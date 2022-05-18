package com.nataliaHomework2;

import java.util.Random;

/* Math.random()- метод для генерации случайного числа
Пример для вывода случайного числа: final Random random = new Random()
int nextInt(int n) - возвращает следующее случайное значение типа int в диапазоне от 0 до n
int nextInt() - возвращает следующее случайное значение типа int;
for (int i = 0; i < size; i++) {
        array[i] = input.nextInt(); - рандом из массива
        нужно присвоить случайным образом объекту из массива cars имя из массива переменных car carGenerationArray
        https://javascopes.com/java-common-array-operations-dcfec6a9/
int anyValue = array[new Random().nextInt(array.length)];

 */

public class CarGenerator implements ModelStorage{
    public static Car[]  CarGeneration(int carsToGenerate)  {
        Car[] cars = new Car[carsToGenerate];
        String[] carGenerationArray = modelArray;
        for(int i = 0; i < cars.length; i++){
            int randomIndex = new Random().nextInt(carGenerationArray.length);
            cars[i] = new Car(carGenerationArray[randomIndex]);
        }
        return cars;
                    }
}
