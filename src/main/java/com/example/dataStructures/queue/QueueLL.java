package com.example.dataStructures.queue;

public class QueueLL {
    static LinkedList queueLL = new LinkedList();

    public static void main(String[] args) {
        QueueLL queue = new QueueLL();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println("front "+queue.front());
        System.out.println("rear "+queue.rear());
        System.out.println(queue.dequeue());
        System.out.println("front "+queue.front());
        System.out.println("rear "+queue.rear());
        System.out.println(queue.dequeue());
        System.out.println("front "+queue.front());
        System.out.println("rear "+queue.rear());
        System.out.println(queue.dequeue());
        System.out.println("front "+queue.front());
        System.out.println("rear "+queue.rear());

    }

    public void enqueue(int data){ queueLL.pushAtHead(data);}

    public int dequeue(){
        return queueLL.pop();
    }

    public int front(){
        return queueLL.returnFront();
    }

    public int rear(){
        return queueLL.returnRear();
    }
}
