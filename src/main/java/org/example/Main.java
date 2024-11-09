package org.example;

public class Main {
    public static void main(String[] args) {

        /*GolsaStack<Integer> stack = new GolsaStack<>();
        stack.push(5);
        stack.push(3);
        stack.push(6);
        stack.pop();

        System.out.println(stack.peek());

        for (Integer item: stack){
            System.out.println(item);
        }*/

        GolsaStackWithArray arrayStack = new GolsaStackWithArray();
        arrayStack.push(5);
        arrayStack.push(3);
        arrayStack.push(6);
        arrayStack.pop();
        System.out.println("top element: " + arrayStack.peek());
        for (Integer item: arrayStack){
            System.out.println(item);
        }

    }


}