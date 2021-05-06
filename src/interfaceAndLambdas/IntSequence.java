package interfaceAndLambdas;

public interface IntSequence { // интерфейс
    boolean hasNext();
    int next();


    static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;

        while (seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0: sum / count; // или ноль или сумму делить на счетчик
    }

    static IntSequence digitsOf(int n) {
        return new DigitSequence(n);
    }

  /*  private static IntSequence makeFiniteSequence(int... values) {
        return IntSequence;
    }
    */







}
