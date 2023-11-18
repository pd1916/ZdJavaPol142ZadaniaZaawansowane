package pl.sdacademy.java.advanced.exercises.day3.task35;

import java.util.concurrent.TimeUnit;

public class Task35 {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(Thread.currentThread().getName());
//        Thread thread = new Thread(new MyRunnable());
//        thread.start();
//        Thread thread2 = new Thread(new MyRunnable());
//        thread2.start();
//        Thread thread3 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
//        thread3.start();
//        thread3.join();
//        System.out.println(Thread.currentThread().getName());
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();
        TimeUnit.SECONDS.sleep(20);
        thread1.interrupt();

//        Thread thread2 = new Thread(new MyRunnable());
//        thread2.start();
    }
}
