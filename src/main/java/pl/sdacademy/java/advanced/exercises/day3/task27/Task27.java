package pl.sdacademy.java.advanced.exercises.day3.task27;

public class Task27 {
    public static void main(String[] args) {
        Joiner<String> strings = new Joiner<>("-");
        String result1 = strings.join("abc", "def", "xyz");
        System.out.println("result1: " + result1);

        Joiner<Integer> integers = new Joiner<>("|");
        String result2 = integers.join(1, 2, 3, 4);
        System.out.println("result2: " + result2);

        Joiner<Boolean> booleans = new Joiner<>("*");
        String result3 = booleans.join(true, false, true);
        System.out.println("result3: " + result3);

        Joiner<Person> persons = new Joiner<>("-STOP-");
        Person person1 = new Person("Jan", "Kowalski");
        Person person2 = new Person("Alina", "Nowak");
        String result4 = persons.join(person1, person2);
        System.out.println("result4: " + result4);
    }
}
