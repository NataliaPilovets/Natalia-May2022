package com.nataliaHomework2;


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
        public void run() {
            System.out.println("the car is coming");
        }


        @Override
        public int move() {
            return 10;
        }

        @Override
        public String toString() {
            return "Display Generated Car" + '\'' + carBrand + '\'' +  carModel + '\'' + "Number of doors=" + doors + ", numberOfHeadlights=" + numberOfHeadlights + ", gasTankVolume=" + gasTankVolume +
                    ", engineVolume=" + engineVolume + ", carBrand='" + carBrand + '\'' + ", carModel='" + carModel + '\'';
        }
    }

