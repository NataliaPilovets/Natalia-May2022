package com.nataliaHomework2;

public class CarTest {
    public static void main(String args[]) {

        /*Car audi = new Car("Audi", "Q5", 2021, "Fiodar", 14.7f, 4, 330);
        Car bmw = new Car("BMW", "X5", 2020, "Natallia", 14.1f, 4, 300);

        bmw.displayInfo();
        audi.displayInfo();
        bmw.run();
        audi.run();
        bmw.stop();
        audi.stop();*/

//        Car car = new Car("Mercedes");
//        car.displayInfo();
//        car.run();
        /*вызывается конструктор 2*/

        /*создаем объект класса Audi*/
//        Audi audi = new Audi ("Audi", "Q5", 2021, "Fiodar", 14.7f, 4, 330);

        /*вызываем методы из класса Car и метод из класса Audi*/
//        audi.displayInfo();
//        audi.run();
//        audi.stop();
//        audi.service();


        /*Создать объект через интерфейс*/
        CarMethods info1 = new Audi("Audi", "Q5", 2021, "Fiodar", 14.7f, 4, 330);
        info1.run();
        CarMethods info2 = new BMW("BMW", "X5", 2020, "Natallia", 14.1f, 4, 300);
        info2.run();


        /*Создать объект, использовать для этого обекта методы из интерфейса*/
        Car audi = new Car("Audi", "Q5", 2021, "Fiodar", 14.7f, 4, 330);
        Car bmw = new Car ("BMW", "X5", 2020, "Natallia", 14.1f, 4, 300);
        outputInfo(audi);
        outputInfo(bmw);
    }

//        Car audi = new Car("Audi", "Q5", 2021, "Fiodar", 14.7f, 4, 330);

    public static void outputInfo(CarMethods info) {
        info.displayInfo();
    }
}

