package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.*;
import java.util.stream.Collectors;

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

    public Car getMostExpensiveCar() {
        return cars.stream()
                //.max(Comparator.comparingDouble(car -> car.getPrice()))
                .max(Comparator.comparingDouble(Car::getPrice))
                .get();
    }

    public List<Car> getCarsWithMoreThan2Manufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= 2)
                .toList();
    }

    public List<Car> getCarsSortedByName(boolean ascending) {
        if(ascending) {
            return cars.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .collect(Collectors.toList());
        } else {
            return cars.stream()
                    .sorted(Comparator.comparing(Car::getName).reversed())
                    .collect(Collectors.toList());
        }
    }

    public boolean contains(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsProducedBy(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .toList();
//        List<Car> result =  new ArrayList<>();
//        for (Car car : cars) {
//            if(car.getManufacturers().contains(manufacturer)) {
//                result.add(car);
//            }
//        }
//        return result;
    }

    public List<Car> getCarsFoundedIn(int foundedYear, Operation operation) {
        return switch(operation) {
            case GREATER_THAN -> cars.stream()
                    .filter(car -> car.getManufacturers().stream()
                            .anyMatch(m -> m.getFoundedYear() > foundedYear))
                    .collect(Collectors.toList());
            case LESS_THAN -> cars.stream()
                    .filter(car -> car.getManufacturers().stream()
                            .anyMatch(m -> m.getFoundedYear() < foundedYear))
                    .collect(Collectors.toList());
            case EQUAL -> cars.stream()
                    .filter(car -> car.getManufacturers().stream()
                            .anyMatch(m -> m.getFoundedYear() == foundedYear))
                    .collect(Collectors.toList());
        };
    }

}
