package pl.sdacademy.java.advanced.exercises.day3.task29;

import java.util.List;

public class Task29 {

    public static void main(String[] args) {
        CollectionCondition collectionCondition = new CollectionCondition();
        List<String> strings = List.of("java", "python", "scala", "c++", "c#");
        double result = collectionCondition.partOf(strings, str -> str.length() > 3);
        System.out.println("strings: " + result);

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        result = collectionCondition.partOf(integers, i -> i >= 3);
        System.out.println("integers: " + result);

    }
}
