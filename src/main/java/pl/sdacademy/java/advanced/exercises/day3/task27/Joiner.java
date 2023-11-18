package pl.sdacademy.java.advanced.exercises.day3.task27;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner<T> {
    private final String delimiter;

    public Joiner(String delimiter) {
        this.delimiter = delimiter;
    }

    public String join(T... elements) {
        return Arrays.stream(elements)
                .map(Object::toString)
                .collect(Collectors.joining(delimiter));
    }

/*    public static void main(String[] args) {
//        fun(new String[]{"abc", "def"});
//        fun(new String[]{"abc"});
//        fun("abc");
//        fun("abc", "def");
        fun(2, "abc", "def", "xyz");
        fun(2);
    }

    private static void fun(int position, String... input) {
        System.out.println();
    }*/
}
