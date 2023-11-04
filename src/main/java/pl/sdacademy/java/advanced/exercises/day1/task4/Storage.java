package pl.sdacademy.java.advanced.exercises.day1.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    //private Map<String, List<String>> storage = new HashMap<>();
    private Map<String, List<String>> storage;

    public Storage() {
        storage = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        if(storage.containsKey(key)) {
            // modify value
            List<String> values = storage.get(key);
            values.add(value);
            storage.put(key, values);
            //storage.get(key).add(value);
        } else {
            //add new key-value
            List<String> values = new ArrayList<>();
            values.add(value);
            storage.put(key, values);
        }
    }

    public void printValues(String key) {
        System.out.println(storage.get(key));
    }

    public List<String> findKeysByStream(String searchedValue) {
        return storage.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(searchedValue))
                //.map(entry -> entry.getKey())
                .map(Map.Entry::getKey)
                .toList();
    }

    public List<String> findKeysByForEach(String searchedValue) {
        List<String> listOfKeys = new ArrayList<>();
        //for(Map.Entry<String, List<String>> entry : storage.entrySet()) {
        for(var entry : storage.entrySet()) {
            if(entry.getValue().contains(searchedValue)) {
                listOfKeys.add(entry.getKey());
            }
        }
        return listOfKeys;
    }

}
