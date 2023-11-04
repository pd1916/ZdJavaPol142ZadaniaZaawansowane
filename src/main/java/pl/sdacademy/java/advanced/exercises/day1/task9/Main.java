package pl.sdacademy.java.advanced.exercises.day1.task9;

public class Main {

    public static void main(String[] args) {
        Point2D center = new Point2D(0, 0);
        Point2D point = new Point2D(0, 4);
        Circle circle = new Circle(center, point);
        double radius = circle.getRadius();
        double perimeter = circle.getPerimeter();
        double area = circle.getArea();

        System.out.println(radius); //4
        System.out.println(perimeter); // 8 * 3,14 = ~25
        System.out.println(area); // 16 * 3,14 = ~50
    }

}
