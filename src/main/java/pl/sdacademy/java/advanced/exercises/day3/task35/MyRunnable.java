package pl.sdacademy.java.advanced.exercises.day3.task35;

import java.util.Random;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Going sleeping " + Thread.currentThread().getName());
            Thread.sleep(1000 + new Random().nextInt(50000));
            System.out.println("Starting " + Thread.currentThread().getName());
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }

//	@Override
//	public void run() {
//		//String name = Thread.currentThread().getName();
//		System.out.printf("%s - Rozpoczynam pracę \n", name);
//		System.out.println();
//		while(!Thread.interrupted()) {
//			System.out.printf("%s - Pracuję \n", name);
//			System.out.printf("%s - Idę spać \n", name);
////            try {
////                //Thread.sleep(1000 + new Random().nextInt(5000));
////                Thread.sleep(5000);
////            } catch(InterruptedException e) {
////                e.printStackTrace();
////            }
//			System.out.printf("%s - Wstałem i pracuję \n", name);
//			System.out.println();
//		}
//		System.out.printf("%s - Kończę pracę \n", name);
//	}
}