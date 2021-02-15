package com.example.dataStructures.linkeList;

public class SwappingElements {

    public static Node head=null;

     public static class Node{
         int data;
         Node next;
         Node(int x){
             this.data = x;
             this.next = null;
         }
     }

    public static void main(String[] args) {
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);
        addNode(6);
        swap(1,6);
        printLL();
    }

    public static void addNode(int x){
         Node newNode = new Node(x);

         if (head!=null){
             newNode.next = head;
         }
         head = newNode;
    }

    public static void printLL(){
         Node ref = head;
         while(ref!=null){
             System.out.println(ref.data);
             ref= ref.next;
         }
    }

    public static void swap(int x, int y){
         if (x==y) return;

         //search for x;
        Node prevX=null,currX=head;
        while (currX!=null&&currX.data!= x){
            prevX=currX;
            currX=currX.next;
        }

        //search for y;
        Node prevY=null,currY=head;
        while(currY!=null&&currY.data!=y){
            prevY=currY;
            currY=currY.next;
        }

        if (currX==null||currY==null) return;

        //if x is not head
        if (prevX!=null){
            prevX.next=currY;
        }else head=currY;

        //if y is not head
        if (prevY!=null){
            prevY.next=currX;
        }else head =currX;

        //swap next pointers
        Node temp = currX.next;
        currX.next=currY.next;
        currY.next=temp;
    }
}
