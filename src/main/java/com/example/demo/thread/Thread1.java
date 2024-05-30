package com.example.demo.thread;

public class Thread1 extends Thread{

    public Thread1(String name) {
        super(name);
    }

    @Override
    public void run(){
        for(int i =0 ;i< 10;i++)
        System.out.println(Thread.currentThread().getName()+" is running for " +i);
    }
}
