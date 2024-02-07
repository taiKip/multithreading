package org.example;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        /*
          lambda's allow us to pass an implementation
          of a method instead of passing an object created
          from a class that implements the said method
         */


        Printable lambdaPrintable = (s)-> System.out.println("Meow" + s );
printThing(lambdaPrintable);
    }


    static void printThing(Printable thing) {
        thing.print("!");
    }
}
