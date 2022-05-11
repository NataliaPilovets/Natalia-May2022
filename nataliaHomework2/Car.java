package com.nataliaHomework2;

public class Car implements CarMethods, CarNames {

                /*Create private fields*/
                private String name;
                private String model;
                private int yearOfCreation;
                private String ownerFullName;
                private float engineVolume;
                private int doors;
                private int powerOfEngine;


        /*Create constructor*/
        public Car(String name, String model, int yearOfCreation, String ownerFullName, float engineVolume, int doors, int powerOfEngine) {
                                this.name = name;
                this.model = model;
                this.yearOfCreation = yearOfCreation;
                this.ownerFullName = ownerFullName;
                this.engineVolume = engineVolume;
                this.doors = doors;
                this.powerOfEngine = powerOfEngine;
        }

        /*Create constructor2*/

        public Car(String name) {
                this.name = name;
        }
        /*Create getters/setters*/

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public int getYearOfCreation() {
                return yearOfCreation;
        }

        public void setYearOfCreation(int yearOfCreation) {
                this.yearOfCreation = yearOfCreation;
        }

        public String getOwnerFullName() {
                return ownerFullName;
        }

        public void setOwnerFullName(String ownerFullName) {
                this.ownerFullName = ownerFullName;
        }

        public float getEngineVolume() {
                return engineVolume;
        }

        public void setEngineVolume(float engineVolume) {
                this.engineVolume = engineVolume;
        }

        public int getDoors() {
                return doors;
        }

        public void setDoors(int doors) {
                this.doors = doors;
        }

        public int getPowerOfEngine() {
                return powerOfEngine;
        }

        public void setPowerOfEngine(int powerOfEngine) {
                this.powerOfEngine = powerOfEngine;
        }



        public void displayInfo() {
                System.out.println("The car Info:  ");
                System.out.println("Name of the car is " + getName() + ". " + "Model of the car is " + getModel()+ ". ");
                System.out.println("Year of creation of " + getName() + " " + getModel() + " is " + getYearOfCreation());
                System.out.println("Owner full name of " + getName() + " " + getModel() + " " + getYearOfCreation() + " is " + getOwnerFullName());
                System.out.println("Engine volume of " + getName() + " " + getModel() + " is " + getEngineVolume());
                System.out.println("The number of doors of " + getName() + " " + getModel() + " is " + getDoors());
                System.out.println("The power of engine of " + getName() + " " + getModel() + " is " + getPowerOfEngine() + " HP");}

                public void run() {System.out.println("The car " + getName()+ " " + getModel() + " is running");}
        public void stop(){System.out.println("The car " + getName()+ " " + getModel() + " is stopped");}
                       }

