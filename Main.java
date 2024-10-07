package org.example;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        golsaStack stack = new golsaStack();
        stack.push(5);
        stack.push(3);
        stack.push(6);
        stack.pop();
       
        System.out.println(stack.peek());

        for (Integer item: stack.customizeStack){
            System.out.println(item);
        }

    }


}