package com.threads;


class MyThread2 implements Runnable{

    public void run() {
        Thread th = Thread.currentThread();
        System.out.println(th);

        for(int i=1;i<=5;i++){
            System.out.println("Val="+i+" by "+th.getName());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class Lab6 {
    public static void main(String[]args){

        Runnable th= new MyThread2();


        Thread mt = new Thread(th);
        mt.start();


        Thread mt1 = new Thread(th);
        mt1.start();

        Thread mt2 = new Thread(th);
        mt2.start();
    }

}
