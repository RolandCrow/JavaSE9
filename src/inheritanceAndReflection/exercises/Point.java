package inheritanceAndReflection.exercises;

import java.util.Objects;

public class Point {

    double x;
    double y;
    double center;

    Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    Point(double center, double x , double y) {
        this.center = center;
        this.x = x;
        this.y = y;
    }
    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
