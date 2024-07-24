package org.example;

public class Van extends Vehicle implements Driveable{
    @Override
    void move() {
        this.drive();
    }

    @Override
    public void getSpeed() {

    }
}
