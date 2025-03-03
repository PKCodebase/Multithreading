package com.threads;

public class Lab2 {
    public static void main(String []args){
        Thread th = Thread.currentThread();
        System.out.println(th);
        for(int i=1;i<=5;i++){
            System.out.println("i="+i+" by "+th.getName());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
               System.out.println(e);
            }
        }
    }
}
