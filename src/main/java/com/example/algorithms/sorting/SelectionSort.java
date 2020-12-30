package com.example.algorithms.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5,3,4,2,6,2,7,0,8,9,1};

        selectionSort(array);

        printArray(array);
    }

    public static void selectionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int index=i;
            int temp = array[i];

            for (int j=i+1;j<array.length;j++){
                if(array[j]>temp){
                    index = j;
                }
            }
            int c = array[index];
            array[index] = array[i];
            array[i] = c;
        }
    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
