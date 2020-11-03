package com.example.dataStructures.linkeList;


import java.util.LinkedList;

public class LinkedListSingly {
        static Node head;  //head of list

        /*Linked list node. This inner class is made static so that main() can access it*/
        static class Node{
            int data ;
            Node next;
            Node(int d){
                data = d;
                next = null;
            }//constructor
            /*Constructor to create a new node Next is by default initialized as null
            * So in this case code will look like
            * Node(int d){  data=d; } */
        }
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args){
        /*Step 1 start with a empty list*/
        LinkedListSingly llist = new LinkedListSingly();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third =  new Node(3);

        /*Three nodes have been allocated dynamically we have references to these three blocks as head,second and third*/
        llist.head.next = second;
        second.next = third;
        /*
        by the above two codes of line we have created links to the head node to second node and
         second node to third
        */
        System.out.println(llist);
//        printList(llist.head);
        addAtFront(4);
//        printList(llist.head);
        addAtPos(3,8);
//        printList(llist.head);
        addAtEnd(5);
        printList(llist.head);

    }
    //methid that prints the LinkedList
    static void printList (Node head)
    {
        if (head!=null){
            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
        else {
            System.out.println("this LinkedlIst is empty");
        }
    }

    //method to add a node at front of the linked list
    static void addAtFront(int a){
        Node newNode = new Node(a); //creation of a new node
        //adding node at front of linked list
        newNode.next = head;
        head = newNode;

    }
    static void addAtPos(int pos,int d){
        Node newNode = new Node(d);
        Node currentNode = head;

        //adding at the nth position
        for (int i=1;i<pos-1;i++){
            currentNode = currentNode.next;
        }
        newNode.next=currentNode.next;
        currentNode.next = newNode;
    }
    static void addAtEnd(int d){
        Node newNode = new Node(d);
        if (head == null){
            addAtFront(d);
            return;
        }

        Node lastNode = head;        //adding at the last of the linked list
        while (lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
}
