package generics.predicate;

import oop.Employee;

public class PrintAll {
    public static void printAll(Employee[] staff, Predicate<? super Employee> filter) { // берем подстановочный типо именно из Employee
        for(Employee e: staff)
            if(filter.test(e))
                System.out.println(e.getName());
    }
}
