package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class GolsaStack<T> implements Iterable<T> {

    private final ArrayList<T> customizeStack = new ArrayList<>();

    int top = -1;


    public GolsaStack() {
    }

    public void push(T value) {
        customizeStack.add(value);
        top++;
    }

    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        customizeStack.remove(top);
        top--;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return customizeStack.get(top);
    }

    public boolean isEmpty() {
        return customizeStack.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return customizeStack.iterator();
    }

}
