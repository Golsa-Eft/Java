package org.example;

public class Main {
    public static void main(String[] args) {

        GolsaStack<Integer> stack = new GolsaStack<>();
        stack.push(5);
        stack.push(3);
        stack.push(6);
        stack.pop();

        System.out.println(stack.peek());

        for (Integer item: stack){
            System.out.println(item);
        }

    }


}