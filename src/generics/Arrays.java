package generics;

public class Arrays {
    public static <T> void swap(T[] array, int i, int j) { // обозначили как массив
        T temp = array[i]; // назначем массиву переменные, или одну или другую
        array[i] = array[j];
        array[j] = temp;
    }
}
