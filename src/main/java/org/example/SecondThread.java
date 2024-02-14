package org.example;

import java.util.concurrent.TimeUnit;

public class SecondThread implements Runnable{
    @Override
    public void run() {
        for(int i =0;i<5;i++){
            System.out.print(" 3 ");
            try{
                TimeUnit.MILLISECONDS.sleep(750);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
