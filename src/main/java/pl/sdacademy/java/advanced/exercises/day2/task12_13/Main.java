package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        Manufacturer volvo = new Manufacturer("Volvo", 1930, "Sweden");
        Car xc90 = new Car("XC90", "XC90", 400_000, 2023, List.of(volvo), EngineType.V8);
        Car xc60 = new Car("XC60", "XC60", 200_000, 2022, List.of(volvo), EngineType.V6);

        carService.add(xc90);
        carService.add(xc60);

        List<Car> allCars = carService.getAll();
        System.out.println("allCars " + allCars.size());

        System.out.println("Adding xc40 to carService");
        Car xc40 = new Car("XC40", "XC40", 150_000, 2022, List.of(volvo), EngineType.S6);
        carService.add(xc40);
        List<Car> allCarsWithXc40 = carService.getAll();

        System.out.println("allCarsWithXc40 " + allCarsWithXc40.size());
        System.out.println("allCars " + allCars.size());

        System.out.println("Adding xc40 to allCars");
        allCars.add(xc40);
        System.out.println("allCarsWithXc40 " + allCarsWithXc40.size());
        System.out.println("allCars " + allCars.size());
        
    }
}
