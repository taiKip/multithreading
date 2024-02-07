package org.example;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        /*
          lambda's allow us to pass an implementation
          of a method instead of passing an object created
          from a class that implements the said method
         */

        move(
                () -> {
                    System.out.println("Car is moving");
                }
        );

    }

    static void move(Vehicle vehicle) {
        vehicle.move();
    }
}
