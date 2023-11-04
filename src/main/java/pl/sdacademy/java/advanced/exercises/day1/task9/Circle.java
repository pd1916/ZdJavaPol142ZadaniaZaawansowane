package pl.sdacademy.java.advanced.exercises.day1.task9;

public class Circle  implements Movable, Resizable {
    private final Point2D center;
    private final Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public Point2D getCenter() {
        return center;
    }

    public Point2D getPoint() {
        return point;
    }

    public double getRadius() {
        //pierw[(x2-x1)^2 + (y2-y1)^2]
        return Math.sqrt(Math.pow(point.getX() - center.getX(), 2)
                + Math.pow(point.getY() - center.getY(), 2));
    }

    public double getPerimeter() {
        // 2 * pi *r
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        // pi * r^2
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        double newX = ((point.getX() - center.getX()) * resizeFactor) + center.getX();
        point.setX(newX);
        double newY = ((point.getY() - center.getY()) * resizeFactor) + center.getY();
        point.setY(newY);
    }
}
