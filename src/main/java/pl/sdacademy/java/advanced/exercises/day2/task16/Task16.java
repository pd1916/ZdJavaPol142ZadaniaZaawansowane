package pl.sdacademy.java.advanced.exercises.day2.task16;

public class Task16 {
    public static void main(String[] args) {
        Runner fitnessLevel1 = Runner.getFitnessLevel(300);
        System.out.println(fitnessLevel1);

        Runner fitnessLevel2 = Runner.getFitnessLevel(256);
        System.out.println(fitnessLevel2);

        Runner fitnessLevel3 = Runner.getFitnessLevel(512);
        System.out.println(fitnessLevel3);

        Runner fitnessLevel4 = Runner.getFitnessLevel(-512);
        System.out.println(fitnessLevel4);
    }
}
