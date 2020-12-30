package com.example.algorithms.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5,2,6,3,1,7,6,9};

        int[] res =  bubbleSort(array);

        printSort(res);
    }

    private static void printSort(int[] res) {
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);
        }

    }

    public static int[] bubbleSort(int[] arr) {
        int swaps = -1;
        while (swaps != 0) {
            swaps = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    swaps++;
                }
            }
        }
        return arr;
    }
}
