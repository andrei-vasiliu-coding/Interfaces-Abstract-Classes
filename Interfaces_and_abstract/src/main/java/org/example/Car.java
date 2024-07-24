package org.example;

public class Car extends Vehicle implements Driveable {

    @Override
    void move() {
        this.drive();
    }

    @Override
    public void getSpeed() {

    }
}
