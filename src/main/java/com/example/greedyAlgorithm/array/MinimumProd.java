package com.example.greedyAlgorithm.array;

import java.util.Scanner;

public class MinimumProd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res = "";

        int T = scanner.nextInt();
        for (int t=0;t<T;t++){
            int N= scanner.nextInt();
            int evenArray = 0;
            int noOfZeros = 0;
            int[] array = new int[N];

            for (int n=0;n<N;n++){
                array[n] = scanner.nextInt();
                if (array[n]<0){
                   evenArray++;
                }
                if (array[n]==0){
                    noOfZeros++;
                }
            }
//            evenArray = evenArray%2;
            res = res + addResult(array,evenArray,noOfZeros)+"\n";
        }
        System.out.println(res);
    }
    public static String addResult(int[] array,int evenArray,int noOfZeros){
        String res = "";
        int product = 1, maxPositive=Integer.MAX_VALUE;
        int minNegative = Integer.MIN_VALUE;

        //if zero is present
        if (noOfZeros>0){
            return res+0;
        }

        //if no -ve integer is present
        if (evenArray==0 && noOfZeros==0){
            for (int i =0;i<array.length;i++){
                if (array[i]<maxPositive){
                    maxPositive = array[i];
                }
            }
         return res+maxPositive;
        }
        if (evenArray/2==0 && noOfZeros==0){
            for (int i=0;i<array.length;i++){
                if (minNegative<array[i]){
                    minNegative= array[i];
                }
                product *= array[i];
            }
            return res+(product/minNegative);
        }
        for (int i=0;i<array.length;i++){
            product*=array[i];
        }
        return res+product;
    }
}
