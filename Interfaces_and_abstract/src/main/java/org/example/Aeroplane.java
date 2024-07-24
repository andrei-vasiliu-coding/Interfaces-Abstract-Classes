package org.example;

public class Aeroplane extends Vehicle implements Flyable {

    @Override
    public void fly() {
        Flyable.super.fly();
    }

    @Override
    void move() {
        this.fly();
    }

    @Override
    public void getSpeed() {

    }
}
