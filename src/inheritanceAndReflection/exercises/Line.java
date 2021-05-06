package inheritanceAndReflection.exercises;

public class Line extends Shape{

    Line(Point from, Point to) {
        super(from.x, from.y, to.x, to.y);
    }
    @Override
    public Point getCenter() {
        return new Point(getX() + getX()/2, getY() + getY()/2);
    }
}
