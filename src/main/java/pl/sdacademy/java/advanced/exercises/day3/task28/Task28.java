package pl.sdacademy.java.advanced.exercises.day3.task28;

import java.util.List;

public class Task28 {

    public static void main(String[] args) {
        SkipArrayList<String> strings = new SkipArrayList<>();
        strings.addAll(List.of("a", "b", "c", "d", "e", "f", "g"));
        List<String> result1 = strings.getEveryNthElement(2, 3);
        System.out.println("result1: " + result1);

        SkipArrayList<Integer> integers = new SkipArrayList<>();
        integers.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        List<Integer> result2 = integers.getEveryNthElement(14, 1);
        System.out.println("result2: " + result2);
    }
}
