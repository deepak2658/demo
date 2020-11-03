package com.example.greedyAlgorithm.array;

import java.util.Scanner;

public class MaxProd {
    /*package whatever //do not write package name here */
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();
            String res = "";

            //no of test cases
            for (int t=0;t<T ;t++ ){
                //specific test case input
                int N = scanner.nextInt();

                int count_negative = 0,count_zeros=0;
                int[] array = new int[N];

                for(int n=0;n<N;n++){
                    array[n]= scanner.nextInt();
                    if (array[n]<0){
                        count_negative++;
                    }
                    if(array[n]==0) count_zeros++;
                }
                res += addResult(array,count_negative,count_zeros)+"\n";
            }
            System.out.println(res);
        }

        public static String addResult(int[] array,int count_negative,int count_zeros){
            int product = 1;
            int highest_negative = Integer.MIN_VALUE;

            if(count_negative==0&&count_zeros==0){
                for (int i=0;i<array.length ;i++ ){
                    product*=array[i];
                }
                return ""+product;
            }

            if(count_negative/2==0){
                for(int i=0;i<array.length;i++){
                    if(array[i]==0) continue;
                    else{
                        product*=array[i];
                    }
                }
                return ""+product;
            }
            for(int i=0 ;i<array.length;i++){
                if(array[i]==0) continue;

                if(array[i]>highest_negative && array[i]<0) highest_negative=array[i];

                product*=array[i];
            }
            return ""+(product/highest_negative);
        }
    }

