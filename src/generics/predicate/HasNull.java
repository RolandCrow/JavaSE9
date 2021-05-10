package generics.predicate;

import java.util.ArrayList;

public class HasNull {
    public static boolean hasNull(ArrayList<?> elements) { // тут только чистый дженерика
        for (Object e : elements) {
            if (e == null) return true;
        }
        return false;
    }


}
