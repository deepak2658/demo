package com.example.dataStructures.stacks;

import java.util.Stack;

public class SpecialStackDS {
    //Class for creating a Stack Data Structure
    static class StackNode {
        Node head;
        static class Node{
            int data;
            Node next;

            Node(int d){
                this.data = d;
                this.next  = null;
            }
        }

        void push(int d){
            Node newNode = new Node(d);
            if (head!=null){
                newNode.next = head;
            }
            head = newNode;
        }
        void pop(){
            head = head.next;
        }
        int peak(){
            return head.data;
        }
    }

    //Creating two Stacks main Stack and Auxiliary Stack
    StackNode mainStack = new StackNode();
    StackNode auxiliaryStack = new StackNode();

    void push(int data){
        if (mainStack.head!=null && auxiliaryStack.head!=null){
             mainStack.push(data);
             if (data<auxiliaryStack.peak()) auxiliaryStack.push(data);
        }else {
            mainStack.push(data);
            auxiliaryStack.push(data);
        }
    }

    void pop(){
        if (mainStack.peak()==auxiliaryStack.peak()) {
            auxiliaryStack.pop();
        }
        mainStack.pop();
    }

    int peek(){
        return mainStack.peak();
    }

    int getMin(){
        return auxiliaryStack.peak();
    }

    public static void main(String[] args) {
        SpecialStackDS stack = new SpecialStackDS();

        stack.push(3);
        stack.push(4);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack.getMin());
        Stack<Integer> s = new Stack<Integer>();
        System.out.println(s.capacity());

    }
}
