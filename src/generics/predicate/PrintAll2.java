package generics.predicate;

public class PrintAll2 {
    public static <T> void printAll2(T[] elements, Predicate<? super T> filter) {
        for(T e : elements)
            if(filter.test(e))
                System.out.println(e.toString());
    }
}
