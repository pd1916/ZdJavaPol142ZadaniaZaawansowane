package pl.sdacademy.java.advanced.exercises.day1.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<String> unsorted = List.of("A", "B", "z", "D", "Z", "C", "a");

        List<String> sorted = sortIgnoreCaseSensitive(unsorted);
        System.out.println(sorted);
    }

    public static List<String> sortIgnoreCaseSensitive(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(new OwnIgnoreCaseSensitiveComparator());
        //sorted.sort((o1, o2) -> -o1.toUpperCase().compareTo(o2.toUpperCase()));
        //sorted.sort((o1, o2) -> -o1.compareToIgnoreCase(o2));
        //sorted.sort(String.CASE_INSENSITIVE_ORDER.reversed());
        return sorted;
    }
}