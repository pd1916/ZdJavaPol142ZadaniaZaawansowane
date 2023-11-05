package pl.sdacademy.java.advanced.exercises.day1.task9_11;

public class Main {

    public static void main(String[] args) {
        // #Task9
        System.out.println("#Task9");
        Point2D center = new Point2D(0, 0);
        Point2D point = new Point2D(0, 4);
        Circle circle = new Circle(center, point);
        double radius = circle.getRadius();
        double perimeter = circle.getPerimeter();
        double area = circle.getArea();

        System.out.println("radius: " + radius); //4
        System.out.println("perimeter: " + perimeter); // 8 * 3,14 = ~25
        System.out.println("area: " + area); // 16 * 3,14 = ~50
        System.out.println("center: " + circle.getCenter());
        System.out.println("point: " + circle.getPoint());

        // #Task10
        System.out.println("\n#Task10");
        MoveDirection moveDirection = new MoveDirection(-1, -2);
        circle.move(moveDirection);
        double radiusAfterMoved = circle.getRadius();
        double perimeterAfterMoved = circle.getPerimeter();
        double areaAfterMoved = circle.getArea();

        System.out.println("radiusAfterMoved: " + radiusAfterMoved); //4
        System.out.println("perimeterAfterMoved: " + perimeterAfterMoved); // 8 * 3,14 = ~25
        System.out.println("areaAfterMoved: " + areaAfterMoved); // 16 * 3,14 = ~50
        System.out.println("center: " + circle.getCenter());
        System.out.println("point: " + circle.getPoint());

        // #Task11
        System.out.println("\n#Task11");
        circle.resize(3);
        double radiusAfterResize = circle.getRadius();
        double perimeterAfterResize = circle.getPerimeter();
        double areaAfterResize = circle.getArea();

        System.out.println("radiusAfterResize: " + radiusAfterResize); // 4*3 = 12
        System.out.println("perimeterAfterResize: " + perimeterAfterResize); // 12 * 2 * 3,14 = ~75
        System.out.println("areaAfterResize: " + areaAfterResize); // 3,14 * 12^2 = ~452
        System.out.println("center: " + circle.getCenter());
        System.out.println("point: " + circle.getPoint());
    }

}
