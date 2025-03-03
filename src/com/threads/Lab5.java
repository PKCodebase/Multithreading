package com.threads;

class MyThread1 extends Thread{

    public MyThread1(){
        super();
    }

    public MyThread1(String name){
        super(name);
    }


    public void run(){
        Thread th = Thread.currentThread();
        System.out.println(th);
        for(int i=1;i<=5;i++){
            System.out.println("Val = "+i+" by "+th.getName());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class Lab5 {
    public static void main(String[] args){
        MyThread1 mt1 = new MyThread1();
        mt1.start();

        MyThread1 mt2 = new MyThread1();
        mt2.start();

        MyThread1 mt3 = new MyThread1();
        mt3.start();


    }
}
