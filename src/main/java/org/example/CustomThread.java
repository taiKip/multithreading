package org.example;

public class CustomThread extends Thread{
    @Override
    public void run() {
       for (int i = 1;i<=5;i++){
           System.out.print(" 1 ");
           try{
Thread.sleep(500); // Adding half a second delay between each count
           }catch(InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
