package pl.sdacademy.java.advanced.exercises.day2.task20_23;

public class Hexagon extends Shape{
    private final double a;

    public Hexagon(double a) {
        this.a = a;
    }

    @Override
    double calculatePerimeter() {
        return 6 * a;
    }
}
