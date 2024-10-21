package org.example;

abstract class Vehicle {
    abstract public void startengine();

    abstract public void stopengine();
}

class Car extends Vehicle {

    @Override
    public void startengine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stopengine() {
        System.out.println("car engine stopped");
    }
}

class Motorbike extends Vehicle {

    @Override
    public void startengine() {
        System.out.println("Motorbike engine started");
    }

    @Override
    public void stopengine() {
        System.out.println("Motorbike engine stopped ");
    }
}


public class prgm11 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        Vehicle v1 = new Motorbike();

        startstopengine(v);
        startstopengine(v1);
    }

    public static void startstopengine(Vehicle vehicle) {
        vehicle.startengine();
        vehicle.stopengine();
    }
}
