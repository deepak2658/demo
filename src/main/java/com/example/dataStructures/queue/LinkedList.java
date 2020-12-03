package com.example.dataStructures.queue;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.DoubleStream;

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


    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        Arrays.sort(a);
        List<Integer> lists = Arrays.asList(1,2,3);
        Object[] array =  lists.toArray();
        Arrays.sort(array);
        List<Integer> list = new ArrayList<>(a.length);

        for (int i : a) {
            list.add(Integer.valueOf(i));
        }
//        System.out.println(list);
//        for (int i = 0; i <array.length ; i++) {
//            System.out.println(array[i]);
//            int x = (int) array[i];
//        }

        int c = 1;
        float Check = c;
        System.out.println(String.format("%.6f",Check/5));
        DoubleStream arr =  Arrays.stream(a).asDoubleStream();
        arr.forEach(e->{
            System.out.println(String.format("%.12f",e));
        });
 //       System.out.println(i);
//        List<List<Integer>> arr = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6));
//        Object[][] array = (Object[][]) arr.toArray();
//
//        System.out.println(array2);
//        System.out.println(list.get(1));
//        Object[] array =  list.toArray();
//        long i = 0;
//        System.out.println(++i);
//        list.forEach(ele->{
//            System.out.println(ele);
//        });
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
