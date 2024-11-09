package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class GolsaStackWithArray implements Iterable<Integer> {

    private final Integer[] customizeStack = new Integer[20];

    int top = 0;


    public GolsaStackWithArray() {
    }

    public void push(Integer value) {
        if (top <= 100) {
            customizeStack[top] = value;
            top++;
        }
    }

    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        top--;
        customizeStack[top] = null;
        top--;
    }

    public Integer peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return customizeStack[top];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return Arrays.stream(customizeStack).iterator();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }
}
