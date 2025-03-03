package com.threads;

import java.util.Map;
import java.util.Set;

public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Main Begin");
        Thread thread = Thread.currentThread();

        Map<Thread,StackTraceElement[]> mymap = thread.getAllStackTraces();
        Set<Thread> mythreads = mymap.keySet();

        for(Thread th:mythreads){
            System.out.println(th);
        }
        System.out.println("Main End");

    }
}
