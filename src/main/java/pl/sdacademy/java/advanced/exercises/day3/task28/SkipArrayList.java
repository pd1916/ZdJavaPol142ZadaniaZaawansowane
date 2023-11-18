package pl.sdacademy.java.advanced.exercises.day3.task28;

import java.util.ArrayList;
import java.util.List;

public class SkipArrayList<E> extends ArrayList<E> {

    public List<E> getEveryNthElement(int startIndex, int skip) {
        List<E> result = new ArrayList<>();
        for(int currentIndex = startIndex; currentIndex < size(); currentIndex+=skip+1) {
            result.add(this.get(currentIndex));
        }
//        int currentIndex = startIndex;
//        while(currentIndex < size()) {
//            result.add(this.get(currentIndex));
//            currentIndex += skip + 1;
//        }
        return result;
    }
}
