package oop.exercises;

public class PointMain {
    public static void main(String[] args) {

       Point p = new Point(2.0, 3.5).translate(1,3).scale(1);
       System.out.println(p);
    }
}
