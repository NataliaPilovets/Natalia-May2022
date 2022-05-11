package com.nataliaHomework2;

public class Audi extends Car {
    public Audi(String name, String model, int yearOfCreation, String ownerFullName, float engineVolume, int doors, int powerOfEngine) {
        super(name, model, yearOfCreation, ownerFullName, engineVolume, doors, powerOfEngine);
    }

    public void service(){
        System.out.println("The car is in Audi Service Center");    }

    @Override
    public void run(){  System.out.println("The car Audi is running faster than BMW"); };
}
