package com.academy.natalia.nataliaHomework2;


import java.util.Objects;

public class Car implements CarMovement, Comparable<Car> {
        private int doors;
        private int numberOfHeadlights;
        private double gasTankVolume;
        private double engineVolume;

        @Override
        public int compareTo(Car o) {
            return this.doors - o.getDoors();
        }

        private String carBrand;
        private String carModel;

        Car(String carBrand, String carModel) {
            this.carBrand = carBrand;
            this.carModel = carModel;
        }

        Car() {

        }

        Car(String carBrand) {
            this.carBrand = carBrand;
        }

        public int getDoors() {
            return doors;
        }

        public void setDoors(int doors) {
            this.doors = doors;
        }

        public int getNumberOfHeadlights() {
            return numberOfHeadlights;
        }

        public void setNumberOfHeadlights(int numberOfHeadlights) {
            this.numberOfHeadlights = numberOfHeadlights;
        }

        public double getGasTankVolume() {
            return gasTankVolume;
        }

        public void setGasTankVolume(double gasTankVolume) {
            this.gasTankVolume = gasTankVolume;
        }

        public double getEngineVolume() {
            return engineVolume;
        }

        public void setEngineVolume(double engineVolume) {
            this.engineVolume = engineVolume;
        }

        public String getCarBrand() {
            return carBrand;
        }

        public void setCarBrand(String carBrand) {
            this.carBrand = carBrand;
        }

        public String getCarModel() {
            return carModel;
        }

        public void setCarModel(String carModel) {
            this.carModel = carModel;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return doors == car.doors && numberOfHeadlights == car.numberOfHeadlights && Double.compare(car.gasTankVolume, gasTankVolume) == 0 && Double.compare(car.engineVolume, engineVolume) == 0 && carBrand.equals(car.carBrand) && carModel.equals(car.carModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doors, numberOfHeadlights, gasTankVolume, engineVolume, carBrand, carModel);
    }

    @Override
        public String toString() {
            return "Display Generated Car" + '\'' + carBrand + '\'' +  carModel + '\'' + "Number of doors=" + doors + ", numberOfHeadlights=" + numberOfHeadlights + ", gasTankVolume=" + gasTankVolume +
                    ", engineVolume=" + engineVolume + ", carBrand='" + carBrand + '\'' + ", carModel='" + carModel + '\'';
        }

    public void run() {
        System.out.println("the car is coming");
    }

    public int move() {
        return 0;
    }
    }

