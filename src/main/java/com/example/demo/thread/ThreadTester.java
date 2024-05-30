package com.example.demo.thread;

public class ThreadTester {

    public static void main(String[] args) {
        System.out.println("main thread is running");

        Thread1 thread1 = new Thread1("thread1");
        thread1.start();

        Thread thread2 = new Thread(new Thread2(),"thread2");
        thread2.start();
        System.out.println("main exists");
    }
}
