package org.example;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread is running");

        try {
            System.out.println("Main thread is paused for one second;");
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
Thread  thread = new Thread(()->{
    String tname = Thread.currentThread().getName();
    System.out.println(tname + " should take 10 dots to run");
    for(int i = 0;i<10;i++){
        System.out.print(". ");
        try{
            TimeUnit.MILLISECONDS.sleep(500);
        }catch (InterruptedException e){
            System.out.println("\nWhoops!! " + tname + " interrupted.");
        }
    }
    System.out.println("\n"+tname + " completed.");
});
        System.out.println(thread.getName() + " Starting");
        thread.start();
        System.out.println("Main thread will continue here");
    }
}