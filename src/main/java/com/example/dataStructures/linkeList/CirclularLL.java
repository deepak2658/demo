package com.example.dataStructures.linkeList;

public class CirclularLL {
    static Node head;
    static Node lastNode;

    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        printll();
    }

    static void push(int d){

        Node newNode = new Node(d);

        if (head == null){
            head = newNode;
            newNode.next = newNode;
            lastNode = newNode;
        }else {
            newNode.next = head;
            head = newNode;
            lastNode.next = newNode;
        }
    }

    static void printll(){
        Node refNode = head;
        do {
            System.out.println(refNode.data);
            refNode = refNode.next;
        }while (refNode!=head);
    }

}
