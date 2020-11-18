package com.example.dataStructures.queue;

public class LinkedList {
    Node head;
    Node lastNode;

    public class Node{
      int data;
      Node next;

      Node(int data){
        this.data = data;
        this.next = null;
      }
    }

    public void pushAtHead(int d){
        Node newNode = new Node(d);
        if (head==null){
            head=lastNode= newNode;
        }else{
            lastNode.next = newNode;
        }
        lastNode = newNode;
    }

    public int pop(){
        int dataToReturn;

        if (head.next == null){
            lastNode = null;
        }
        if (head!=null) {
            dataToReturn = head.data;
            head = head.next;
            if (head==null) return -1;
            return dataToReturn;
        }
        else return -1;
    }

    public int returnRear(){
        if (lastNode!=null)
        return lastNode.data;
        else return -1;
    }

    public int returnFront(){
        if (head!=null){
            return head.data;
        }
        else return -1;

    }
}
