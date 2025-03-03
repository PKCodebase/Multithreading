package com.threads;

class Mythread extends Thread{
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


public class Lab3 {
    public static void main(String[]args){
       Mythread mt = new Mythread();
       mt.start();

       Mythread mt1 = new Mythread();
       mt1.start();

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
