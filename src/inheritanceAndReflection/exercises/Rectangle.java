package inheritanceAndReflection.exercises;

public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(Point topLeft, double width, double height) {
        super(topLeft.getX(), topLeft.getY(), topLeft.x, topLeft.y);
        this.width = width;
        this.height = height;
    }


    @Override
    public Point getCenter() {
        return new Point(getX() + width/2, getY() + height/2);
    }
}
