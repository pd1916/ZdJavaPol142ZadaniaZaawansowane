package pl.sdacademy.java.advanced.exercises.day3.args;

public class Test {

    public static void main(String[] args) {
        System.out.println("hello world!");
        System.out.println("Size: " + args.length);
        for(String s : args) {
            System.out.println(s);
        }

        if(args.length > 0) {
            // to oznacza że job został uruchomiony z konkretną datą
            // date = to co przyszło
        } else {
            // date = current date -1
        }

        // 1. get (current date - 1)
        // 2. get transactions for (current date - 1)
        // 3. prepare file
        // 4. send
    }
}
