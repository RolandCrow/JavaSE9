package oop.exercises;

public class Point {
    double x;
    double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point translate(double dx, double dy) { // методы для возвращения нового значения класс
        return new Point(this.x += dx, this.y +=dy);
    }

    public Point scale(double coefficient) { // метод возращвет новый объект класса
       return new Point(this.x * coefficient, this.y * coefficient);
    }



    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
