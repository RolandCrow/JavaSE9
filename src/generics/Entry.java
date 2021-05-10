package generics;

public class Entry<K,V>{ // дженерики с заданными парметрами для удобства создания объектов

    private final V value;
    private final K key;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
