package org.example;

public interface Driveable extends Movable {
    default void drive() {
        System.out.println(this.getClass().getSimpleName() + " is being driven!");
    }

}
