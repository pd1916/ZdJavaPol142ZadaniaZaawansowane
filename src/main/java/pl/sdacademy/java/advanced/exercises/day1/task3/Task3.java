package pl.sdacademy.java.advanced.exercises.day1.task3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> input = new LinkedHashMap<>();
        input.put("Java", 18);
        input.put("Python", 1);
        input.put("C#", 12);
        input.put("JavaScript", 7);
        input.put("Scala", 20);
        input.put("PHP", 0);
        //print(input);
        printUsingStream(input);
    }

    public static void print(Map<String, Integer> input) {
        int i = 0;
        for(Map.Entry<String, Integer> entry : input.entrySet()) {
            i++;
            if(i == input.size()) {
                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ".");
            } else {
                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ",");
            }
        }
    }

    public static void printUsingStream(Map<String, Integer> input) {
        String list = input.entrySet()
                .stream()
                .map(entry -> "Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue())
                .collect(Collectors.joining("," + System.lineSeparator(), "", "."));
        System.out.println(list);
    }
}
