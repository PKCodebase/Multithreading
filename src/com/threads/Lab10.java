package com.threads;

class Account{
    int bal = 970;

   public int getBal(){
        return bal;
    }
    public synchronized void withdraw(int amt){
       Thread th = Thread.currentThread();
        if(bal>=amt) {
            System.out.println(th.getName() + " is going to withdraw " + bal);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                bal = bal - amt;
                System.out.println(th.getName() + " has completed withdraw " + bal);
            }
        }else{
            System.out.println("Insufficient Balance"+th.getName());
        }
    }
}

class AccountThread implements Runnable{
    Account acc ;
    AccountThread(Account acc){
        this.acc = acc;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            acc.withdraw(225);
            if(acc.getBal()<0){
                System.out.println("0000- Amount is overdrawn");
            }
        }
    }
}
public class Lab10 {
    public static void main(String []args){
        Account acc = new Account();

        Runnable runnable =  new AccountThread(acc);

        Thread th1 = new Thread(runnable,"A");
        th1.start();

        Thread th2 = new Thread(runnable, "B");
        th2.start();
    }
}
