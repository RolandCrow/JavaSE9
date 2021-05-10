package generics;

import oop.Employee;

import java.util.ArrayList;

public class Staff {

    public static void printNames(ArrayList<? extends Employee> staff) { // дикая карта или подстановочный знак ?, используется для более сложных объектов чем простые типы
        for(int i =0; i < staff.size(); i++) {
            Employee e = staff.get(i);
            System.out.println(e.getName()); // получаем все имена через цикл
        }


    }
}
