package interfaceAndLambdas.comparable;

import java.util.Arrays;

public class LengthComparator implements Comparator<String>{

    @Override
    public int compareTo(String first, String second) {
        return first.length() - second.length(); // сравнение длин
    }





}
