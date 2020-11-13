package com.example.dataStructures.stacks;

public class StackIntro {
    static int top;
    static int arr[] = new int[1000];

    StackIntro()
    {
        top = -1;
    }

    static class StackLL{
        Node head;
         static class Node{
            int data;
            Node next;

            Node(int d) {
                this.data = d;
                this.next = null;
            }
        }
        void stackLLPush(int d){
            Node newNode = new Node(d);

            if (head != null) {
                newNode.next = head;
            }
            head = newNode;
        }
        void stackLLPop(){
            if (head!=null){
                System.out.println(head.data);
                head = head.next;
            }else System.out.println("underflow");
        }
    }
    /* The method push to push element
        into the stack */
     void pushArr(int a)
    {
        // Your code here
        if(top==(arr.length-1)){
            System.out.println("Overflow condition");
        }
        else {
            top++;
            arr[top] = a;
        }
    }

    /* The method popArr which return
      the element popArr out of the stack*/
     void popArr()
    {
        // Your code here
        if(top == -1){
            System.out.println("-1");
        }
        else{
            System.out.println(arr[top--]);
        }
    }
    void pushLL(int a){

    }

    public static void main(String[] args) {
        //creating a new stack using array
        StackIntro stack = new StackIntro();
        stack.popArr();
        stack.pushArr(1);
        stack.pushArr(2);
        stack.popArr();

        //creating a new stack using ll
        StackLL stackLL = new StackLL();

        stackLL.stackLLPop();
        stackLL.stackLLPush(1);
        stackLL.stackLLPush(2);
        stackLL.stackLLPop();
    }
}
