package org.example;

public interface Driveable {
    default void drive() {
        System.out.println(this.getClass().getSimpleName() + " is being driven!");
    }
}
