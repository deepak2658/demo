package com.example.algorithms.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,2,6,1,7};

        int[] res =  sortInsertion(array);

        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    private static int[] sortInsertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for(int j = i;j>=0;i--){
                if(array[j-1]>array[j]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }
}
