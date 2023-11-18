package pl.sdacademy.java.advanced.exercises.day3.task36;

public class ThreadPlaygroundRunnable implements Runnable {
    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 1; i < 10; i++) {
            System.out.printf("%s (%s): #%d\n", Thread.currentThread().getName(), name, i);
        }
    }
}