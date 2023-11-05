package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }

    public void remove(Car car) {
        cars.remove(car);
    }

    public List<Car> getAll() {
        //return cars; // będziemy cały czas operować na kolekcji cars
        //return List.copyOf(cars); // zrobiebie kopi cars, ale jako niemodyfikowalną listę
        return new ArrayList<>(cars); // nowa modyfikowalna lista samochodów
    }

}
