package org.example;

public class Student implements  Print{
    @Override
    public void print(String name) {
        System.out.println("My name is " + name);
    }
}
