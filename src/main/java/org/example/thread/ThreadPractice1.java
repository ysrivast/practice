package org.example.thread;

public class ThreadPractice1 {

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        Thread t2 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        t1.setName("T1");
        t2.setName("T2");
        t1.start();
        t2.start();
    }
}
