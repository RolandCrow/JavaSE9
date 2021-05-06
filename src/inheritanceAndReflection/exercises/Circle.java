package inheritanceAndReflection.exercises;

public class Circle extends Shape{
    double radius;

    Circle(Double x, Double y, Double dx, Double dy) {
        super(x, y, dx, dy);
    }

    Circle(Point center, double radius) {
        super(center.x, center.y, center.getX(), center.getY());
        this.radius = radius;
    }


    @Override
    public Point getCenter() {
        return new Point(0,0);
    }
}
