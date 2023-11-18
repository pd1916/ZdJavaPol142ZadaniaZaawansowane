package pl.sdacademy.java.advanced.exercises.day3.task34;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}