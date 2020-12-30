package com.example.algorithms.sorting;

public class QuickSort {
    static int[] array = {5,4,6,3,7,2,8,1,9,0};
    public static void main(String[] args) {


        quickSortMain(array,0,array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void quickSortMain(int[] array, int start, int end) {

        if (start<end) {
            int index = partition(array,start,end);

            quickSortMain(array, start, index - 1);
            quickSortMain(array, index + 1, end);
        }

    }

    private static int partition(int[] array,int start,int end) {

        int pIndex = start;

        int pivot=array[end];

        for(int i = start; i <end; i++) {
            if (array[i]<=pivot){
                int temp = array[i];
                array[i]=array[pIndex];
                array[pIndex]=temp;

                pIndex++;
            }
        }

        array[end]=array[pIndex];
        array[pIndex]=pivot;

        return pIndex;
    }


}
