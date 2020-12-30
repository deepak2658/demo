package com.example.dataStructures.linkeList;

/*For deleting a linked list we only have declare head as null and garbage collector automatically removed the rest
* static void deleteLL(){head = null}
*
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinkedListDeletion {
    private static Node head;

    static class Node {
        int data;
        Node next;

        //class constructor
        Node(int d){
            this.data = d;
            this.next  = null;
        }
    }

    public static void main(String[] args) {
        //creating a new linked list
        LinkedListSingly llist = new LinkedListSingly();

        pushAtFront(3);
        pushAtFront(2);
        pushAtFront(1);
        print();
        delete(1);
        System.out.println(countNodes(head));
        int[] arry = {1,3,5,2,1};
        Arrays.sort(arry);


    }

    static void pushAtFront(int d){
        Node newNode = new Node(d);

        if (head==null){
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
     static void print(){
        Node node = head;
        while(node!= null){
            System.out.println(node.data);
            node = node.next;
        }
     }
     static void delete(int x){
        if (head ==null){
            System.out.println("Linked list is empty");
            return;
        }
        if (head.data == x){
            head = head.next;
            return;
        }
        Node previousNode=head,deleteToNode=null;

        while(previousNode.next.data!=x){
            previousNode = previousNode.next;
        }
        deleteToNode = previousNode.next;
        previousNode.next = deleteToNode.next;
        print();

     }
     static void deleteAtPos(int pos){
        if (pos==1){
            head = head.next;
        }else {
            Node prevNode = head,currNode = null;

            for(int i=1;i<pos-1;i++){
                prevNode = prevNode.next;
            }

            currNode = prevNode.next;
            prevNode.next = currNode.next;
        }
    }
    //code to count the no of nodes recursively
    static int countNodes(Node node){
        if (node==null){
             return 0;
        }
        return 1+ countNodes(node.next);
    }
}

