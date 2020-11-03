package com.example.greedyAlgorithm.array;

import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Scanner;

public class NegationsWithPQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T= scanner.nextInt();

        String res = "";

        for (int t=0;t<T;t++){
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
            int n_no_count=0;
            int N= scanner.nextInt();
            int k = scanner.nextInt();
            for (int n=0;n<N;n++){
                int temp = scanner.nextInt();
                pq.add(temp);
                if (temp<0) n_no_count++;
            }

           res += returnMaxSum(pq,k)+"\n";
        }
        System.out.println(res);
    }

    private static String returnMaxSum(PriorityQueue<Integer> pq, int k) {
        BigInteger sum = new BigInteger("0");

        while (k-- > 0)
        {
            // Retrieve and remove min element
            int temp = pq.poll();

            // Modify the minimum element and add back
            // to priority queue
            temp *= -1;
            pq.add(temp);
        }
        for (int x:pq){
            sum= sum.add(BigInteger.valueOf(x));
        }
        return ""+sum;
    }
}
