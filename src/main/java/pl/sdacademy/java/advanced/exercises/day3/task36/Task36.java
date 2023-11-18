package pl.sdacademy.java.advanced.exercises.day3.task36;

public class Task36 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadPlaygroundRunnable("job_1"));
        Thread t2 = new Thread(new ThreadPlaygroundRunnable("job_2"));

        t1.start();
        t2.start();

//        try {
//            t1.interrupt();
//            t1.join();
//        } catch (InterruptedException e) {
//            System.out.println("t1 zostal przerwany");
//        }
        System.out.println(Thread.currentThread().getName());
    }
}
