package com.example.dataStructures.stacks;

import java.util.Stack;

public class SpecialStackSpaceO1 {
    static Stack<Integer> stack = new Stack<Integer>();
    static int minEle;

    public static void main(String[] args) {
        push(3);
        push(5);
        push(2);
        push(1);
        pop();
        System.out.println(minEle);
        pop();
        System.out.println(minEle);
        pop();
        System.out.println(minEle);
        pop();
    }

    static void push(int x){
        if (stack.isEmpty()){
            stack.push(x);
            minEle = x;
        }else {
            minEle=x;
            stack.push(2*x-minEle);
        }
    }

    static void pop(){
        int y = stack.peek();
        if (y < minEle) {
            minEle = 2 * minEle - y;
        }
        stack.pop();
    }

    static void peek(){
        int t = stack.peek();
        if (t>minEle) System.out.println(t);
        else System.out.println(minEle);
    }
}
