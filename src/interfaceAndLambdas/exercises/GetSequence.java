package interfaceAndLambdas.exercises;

public class GetSequence {

    public static IntSequence[] of (int...ints) {
        IntSequence[] arr = new IntSequence[ints.length];
        for(int i = 0; i < ints.length; i++) {
            int finalI = i;
            arr[i] = new IntSequence() {
                @Override
                public int getSequence() {
                    return ints[finalI];
                }
            };

        }
        return arr;

    }

}
