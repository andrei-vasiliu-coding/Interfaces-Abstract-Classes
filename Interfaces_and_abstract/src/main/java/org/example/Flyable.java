package org.example;

public interface Flyable extends Movable {
    default void fly() {
    System.out.println(this.getClass().getSimpleName() + " is flying!");
    }
}
