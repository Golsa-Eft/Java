package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class golsaStack implements Iterable<Integer> {
    ArrayList<Integer> customizeStack = new ArrayList<>();
     int top = -1;

    public void push(Integer value){
        customizeStack.add(value);
        top++;
    }
    public void pop(){
        customizeStack.remove(top);
        top--;
    }
    public Integer peek(){
        return customizeStack.get(top);
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }
}
