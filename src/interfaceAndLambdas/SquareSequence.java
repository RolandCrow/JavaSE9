package interfaceAndLambdas;

public class SquareSequence implements IntSequence {
    private int i;


    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        i++;
        return i*i; // сам счетчик в интерфейсе
    }
    SquareSequence squareSequence = new SquareSequence();
    double avg = IntSequence.average(squareSequence, 100);


}
