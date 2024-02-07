package org.example;

import java.util.concurrent.TimeUnit;

public class MyCustomThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<=8;i++){
            System.out.print(" 2 ");
            try {
                TimeUnit.MILLISECONDS.sleep(250);
            }catch (InterruptedException e){
               e.printStackTrace();
            }
        }
    }
}
