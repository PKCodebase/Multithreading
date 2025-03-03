package com.threads;

class Mythreads implements Runnable{
    public void run(){
        Thread th = Thread.currentThread();
        for(int i=1;i<=5;i++){
            System.out.println("Val - " + i + " by " + th.getName() );

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class Lab4 {
    public static void main(String []args){
      Mythreads mt = new Mythreads();

      Thread th1 = new Thread(mt);
      th1.start();

      Thread th2 = new Thread(mt);
      th2.start();
        Thread th = Thread.currentThread();
        for(int i=1;i<=5;i++){
            System.out.println("Hello Guys " + i + " by " + th.getName());

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }

    }
}
