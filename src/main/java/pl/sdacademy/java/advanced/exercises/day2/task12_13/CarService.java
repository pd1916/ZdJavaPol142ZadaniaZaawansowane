package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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

    public List<Car> getCarsWithV12Engine() {
//        List<Car> result = new ArrayList<>();
//        for(Car car : cars) {
//            if(car.getEngineType().equals(EngineType.V12)) {
//                result.add(car);
//            }
//        }
//        return result;
        return cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .toList();
    }

    public List<Car> getCarsProducedBefore1999() {
        return cars.stream()
                .filter(car -> car.getProductionYear() < 1999)
                .toList();
    }

    public Optional<Car> getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparingDouble(Car::getPrice));
                //.get();
    }

}
