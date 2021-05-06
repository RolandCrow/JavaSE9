package interfaceAndLambdas;

import java.util.Random;

public class LocalClass {

    private static Random generator = new Random();

    public static IntSequence randomInts(int low, int high) {
        class RandomSequence implements IntSequence { // Локальный класс внутри метода
            public int next() {return low + generator.nextInt(high - low + 1);}
            @Override
            public boolean hasNext() {
                return true;
            }
        }
        return new RandomSequence();

    }




}
