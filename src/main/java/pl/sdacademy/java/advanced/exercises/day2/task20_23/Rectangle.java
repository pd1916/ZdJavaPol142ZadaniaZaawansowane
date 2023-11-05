package pl.sdacademy.java.advanced.exercises.day2.task20_23;

public class Rectangle extends Shape{
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculatePerimeter() {
        return (2 * a) + (2 * b);
    }
}
