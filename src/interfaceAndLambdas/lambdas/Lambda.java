package interfaceAndLambdas.lambdas;

import java.util.Comparator;
import java.util.function.IntConsumer;

public class Lambda {


    public static void repeat(int n, Runnable action) {
        for(int i = 0; i < n; i++) action.run();
    }

    public static void repeat2(int n, IntConsumer action) {
        for(int i = 0; i < n; i++) action.accept(i);
    }

    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
            for(int i = 0; i < count; i++) {
                System.out.println(text);
            }
        };
        new Thread(r).start();
    }

    public static Comparator<String> compareInDirection(int direction) {
        return (x,y) -> direction * x.compareTo(y);
    }

    public static Comparator<String> reverse(Comparator<String> comp) {
        return (x,y) -> comp.compare(y,x);
    }









}
