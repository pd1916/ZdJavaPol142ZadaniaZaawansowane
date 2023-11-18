package pl.sdacademy.java.advanced.exercises.day3.task34;

public class Task34 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();

        MyThread thread2 = new MyThread();
        thread2.start();
    }
}
