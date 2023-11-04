package pl.sdacademy.java.advanced.exercises.day1.task1;

import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> unsorted = List.of("A", "B", "Z", "D", "C");

        List<String> sorted = sortUsingAnonymousClass(unsorted);
        System.out.println("sortUsingAnonymousClass: " + sorted);

        sorted = sortUsingOwnComparator(unsorted);
        System.out.println("sortUsingOwnComparator: " + sorted);

        sorted = sortUsingLambda(unsorted);
        System.out.println("sortUsingLambda: " + sorted);

        sorted = sortUsingReverseOrder(unsorted);
        System.out.println("sortUsingReverseOrder: " + sorted);

        sorted = sortOnList(unsorted);
        System.out.println("sortOnList: " + sorted);

        sorted = sortUsingStream(unsorted);
        System.out.println("sortUsingStream: " + sorted);
    }

    public static List<String> sortUsingAnonymousClass(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                /*
                sortuje od A do Z
                o1.compareTo(o2) -> 0 gdy o1 jest równe o2
                o1.compareTo(o2) -> -1 gdy o1 jest mniejsze od o2
                o1.compareTo(o2) -> 1 gdy o1 jest większe od o2
                 */
                //return -o1.compareTo(o2);
                return o2.compareTo(o1);
            }
        });
        return sorted;
    }

    public static List<String> sortUsingOwnComparator(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new OwnSortComparator());
        return sorted;
    }

    public static List<String> sortUsingLambda(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, (o1, o2) -> o2.compareTo(o1));
        return sorted;
    }

    public static List<String> sortUsingReverseOrder(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, Comparator.reverseOrder());
        return sorted;
    }

    public static List<String> sortOnList(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(Comparator.reverseOrder());
        //sorted.sort(new OwnSortComparator());
        //sorted.sort((o1, o2) -> o2.compareTo(o1));
        return sorted;
    }

    public static List<String> sortUsingStream(List<String> unsorted) {
        List<String> sortedCollections = new ArrayList<>(unsorted);
        return sortedCollections.stream()
                .sorted(Comparator.reverseOrder())
                //.collect(Collectors.toList());
                .toList();
    }
}
