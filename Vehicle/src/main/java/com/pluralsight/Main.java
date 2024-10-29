package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(15);
        slowRide.setCargoCapacity(4);
        slowRide.setNumberOfPassengers(2);

        Car hondaCRV = new Car();
        hondaCRV.setColor("Hot Pink");
        hondaCRV.setFuelCapacity(60);
        hondaCRV.setCargoCapacity(10);
        hondaCRV.setNumberOfPassengers(5);

        Hovercraft hover1 = new Hovercraft();
        hover1.setColor("White + Blue");
        hover1.setFuelCapacity(35);
        hover1.setCargoCapacity(7);
        hover1.setNumberOfPassengers(4);

        SemiTruck kenworthW990 = new SemiTruck();
        kenworthW990.setColor("Orange");
        kenworthW990.setFuelCapacity(100);


    }
}