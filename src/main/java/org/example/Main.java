package org.example;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        /**
         * @desc instead of sending an object that contains the action we just
         * send the action itself
         */
        Printable lambdaPrintable = (s)-> System.out.println("Meow!" + s);
        printThing((s) ->
                System.out.println("meow")
        );
printThing(lambdaPrintable);
    }

    public static void printThing(Printable thing) {
        thing.print("s");
    }
}