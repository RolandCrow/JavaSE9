package inheritanceAndReflection.exercises;

public abstract class Shape extends Point{
    double dx;
    double dy;

    Shape(Double x, Double y, Double dx, Double dy) {
        super(x,y);
        this.dx = dx;
        this.dy = dy;
    }

    public Shape(double x, double y, double dx, double dy) {
        super(x, y);
        this.dx = dx;
        this.dy = dy;
    }

    public Shape(double center, double x, double y, double dx, double dy) {
        super(center, x, y);
        this.dx = dx;
        this.dy = dy;
    }

    public void moveBy(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;

    }

    public abstract Point getCenter();


}
