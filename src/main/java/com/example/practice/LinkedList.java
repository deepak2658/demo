package com.example.practice;

public class LinkedList {
    static Node head = null;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        llPush(ll,1);
        llPush(ll,2);
        llPush(ll,3);
        llPush(ll,4);
        llPushAtPos(ll,5,5);
        llAddAtEnd(6);
        llDeleteAtPos(5);

        int top = llPeekTop();
        System.out.println(top);
        System.out.println(Math.abs(-1));
//        llPrint();

        llPop();
        llPop();
    }

    private static void llAddAtEnd(int i) {
        Node ref = head;
        Node newNode = new Node(i);
        while (ref.next!=null){
            ref = ref.next;
        }
        ref.next = newNode;
    }

    private static void llDeleteAtPos(int i) {
        if (i==1){
            head = head.next;
            return;
        }else {
            Node ref = head;
            for (int j = 1; j < i-1; j++) {
                ref = ref.next;
            }
            Node nodeDel = ref.next;

            ref.next = nodeDel.next;
            nodeDel.next = null;
        }
    }

    private static void llPushAtPos(LinkedList ll, int data, int pos) {
        Node ref = head;
        Node newNode = new Node(data);
        if (pos==1){
            newNode.next = head;
            head = newNode;
            return;
        }
        else {
            for (int i = 1; i < pos - 1; i++) {
                ref = ref.next;
            }
            newNode.next = ref.next;
            ref.next = newNode;
        }
    }

    public static void llPush(LinkedList ll,int data){
        Node newNode = new Node(data);

        if (head!=null){
            newNode.next=head;
        }
        head = newNode;
    }

    public static void llPrint(){
        Node ref = head;

        while (ref!=null){
            System.out.println(ref.data);
            ref = ref.next;
        }
    }

    public static void llPop(){
        if (head!=null){
            head = head.next;
        }
    }

    public static int llPeekTop(){
        if (head!=null) {
            return head.data;
        }
        else return -1;
    }
}
