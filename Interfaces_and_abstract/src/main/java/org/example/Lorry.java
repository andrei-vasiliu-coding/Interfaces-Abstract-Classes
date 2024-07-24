package org.example;

public class Lorry extends Vehicle implements Driveable{
    @Override
    void move() {
        this.drive();
    }
}
