package generics.exercises;

import java.util.ArrayList;

public class Stack<E> {

    private final ArrayList<E> stack = new ArrayList<E>();
    public void push(E e) {
        stack.add(e);
    }

    public E pop() {
        return stack.remove(0);
    }

    public boolean isEmpty(E e) {
        return stack.isEmpty();
    }



}
