package com.threads;

class MyThread3 extends Thread{

    public MyThread3(){
        super();
    }

    public MyThread3(String name){
        super(name);
    }

    public MyThread3(ThreadGroup tg,String name){
        super(tg,name);
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
public class Lab7 {
    public static void main(String[] args){
        Thread th = Thread.currentThread();
        th.setPriority(1);

        ThreadGroup tg = new ThreadGroup("jlc");

        MyThread3 mt1 = new MyThread3(tg, "A");
        mt1.setPriority(6);
        mt1.start();

        MyThread3 mt2 = new MyThread3(tg, "B");
        mt2.setPriority(6);
        mt2.start();

        MyThread3 mt3 = new MyThread3("C");
        mt3.start();

        System.out.println(tg);
        System.out.println(mt1);
        System.out.println(mt2);
        System.out.println(mt3);
    }
}
