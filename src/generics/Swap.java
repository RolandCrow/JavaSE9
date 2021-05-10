package generics;

import java.util.ArrayList;

public class Swap {
    public static void swap(ArrayList<?> elements, int i, int j) {
        swapHelper(elements, i, j);
    }

    private static <T> void swapHelper(ArrayList<T> elements, int i, int j) { // ловит неизвестный тип и превращает в нужный
        T temp = elements.get(i);
        elements.set(i, elements.get(i));
        elements.set(j, temp);
    }


}
