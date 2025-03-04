package com.threads;

class MyThread4 implements Runnable {

    public void run() {
      Thread th  = Thread.currentThread();

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
public class Lab8 {

    public static void main(String[] args){
       Thread th = Thread.currentThread();
       th.setPriority(1);


       ThreadGroup tg = new ThreadGroup("MyGroup");
       Runnable runnable = new MyThread4();

       Thread th1 = new Thread(tg,runnable,"A");
       th1.setPriority(9);
       th1.start();


       Thread th2 = new Thread(tg, runnable, "B");
       th2.setPriority(9);
       th2.start();

       Thread th3 = new Thread(tg, runnable, "C");
       th3.start();


       System.out.println(th);
       System.out.println(th1);
       System.out.println(th2);
       System.out.println(th3);


    }
}
