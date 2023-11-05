package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.List;
import java.util.Objects;

public class Car {
    private final String name;
    private final String model;
    private final double price;
    private final int prodcutionYear;
    private final List<Manufacturer> manufacturers;
    private final EngineType engineType;

    public Car(String name, String model, double price, int prodcutionYear, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.prodcutionYear = prodcutionYear;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getProdcutionYear() {
        return prodcutionYear;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(price, car.price) == 0 && prodcutionYear == car.prodcutionYear && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturers, car.manufacturers) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, prodcutionYear, manufacturers, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", prodcutionYear=" + prodcutionYear +
                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }
}