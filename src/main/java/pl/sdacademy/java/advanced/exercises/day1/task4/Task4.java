package pl.sdacademy.java.advanced.exercises.day1.task4;

import java.util.List;

public class Task4 {

    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.addToStorage("0", "value0_1");
        storage.addToStorage("1", "value1_1");
        storage.addToStorage("2", "value2_1");
        storage.addToStorage("2", "value2_2");
        storage.addToStorage("3", "value3_1");
        storage.addToStorage("4", "value0_1");

        storage.printValues("2");
        storage.printValues("4");

        List<String> keys = storage.findKeysByForEach("value0_1");
        System.out.println(keys);

        keys = storage.findKeysByForEach("value1_1");
        System.out.println(keys);

        keys = storage.findKeysByForEach("dummy_value");
        System.out.println(keys);
    }
}
