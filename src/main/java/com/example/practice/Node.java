package com.example.practice;

import java.util.*;

public class Node {
    int data;
    Node next;

    Node(int x){
        this.data = x;
        this.next = null;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = new int[4];
        int x= Arrays.stream(arr).max().getAsInt();
        List ll  = Arrays.asList(arr);
        Collections.sort(ll);
        ll.forEach(e->{
//            System.out.println(""+e+1);
        });

        Object[] arry = ll.toArray();
        Arrays.sort(arry);
        List<Integer> list=new ArrayList<Integer>();
        list.add(12);
        Collections.sort(list);
        System.out.println(list.get(0));

        HashMap<Integer,Integer> ss = new HashMap<>();
        ss.put(1,1);
        ss.get(1);
        ss.containsKey(1);

        Queue<Node> q = null;
        q.add(new Node(1));
        q.peek();


    }
}
