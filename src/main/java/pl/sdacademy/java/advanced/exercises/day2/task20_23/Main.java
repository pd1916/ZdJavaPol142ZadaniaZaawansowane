package pl.sdacademy.java.advanced.exercises.day2.task20_23;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("rectanglePerimeter: " + rectanglePerimeter);

        Shape triangle = new Triangle(2, 3, 4);
        double trianglePerimeter = triangle.calculatePerimeter();
        System.out.println("trianglePerimeter: " + trianglePerimeter);

        Shape hexagon = new Hexagon(2);
        double hexagonPerimeter = hexagon.calculatePerimeter();
        System.out.println("hexagonPerimeter: " + hexagonPerimeter);

        Shape3D cube = new Cube(2);
        double cubePerimeter = cube.calculatePerimeter();
        double cubeVolume = cube.calculateVolume();
        System.out.println("cubePerimeter: " + cubePerimeter);
        System.out.println("cubeVolume: " + cubeVolume);
    }
}
