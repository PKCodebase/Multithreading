package com.threads;

class MyThread5 implements Runnable {
    public void run() {
       Thread th = Thread.currentThread();

       for(int i=1;i<=5;i++){
           System.out.println("Val="+i+" by "+th.getName()+"-"+th.getState());
           try{
               Thread.sleep(1000);
           }catch(InterruptedException e){
               System.out.println(e);
           }
       }
    }
}

public class Lab9 {
    public static void main(String[]args) throws InterruptedException {
        Runnable runnable =  new MyThread5();

        Thread th = new Thread(runnable,"A");
        System.out.println("1. "+ th.getState());
        th.start();

        System.out.println("2. "+ th.getState());

        Thread.sleep(500);
        System.out.println("3. "+ th.getState());

        Thread.sleep(500);
        System.out.println("4. "+ th.getState());
    }

}
