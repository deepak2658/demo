package com.example.algorithms.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5,4,6,3,7,2,8,1,9,0};

        int[] arr = MergeSortMain(array);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] MergeSortMain(int[] array) {
        if (array.length<2){
            return array;
        }

        int mid = (array.length)/2;

        int[] leftArray = new int[mid];
        for(int i=0;i<mid;i++){
            leftArray[i]= array[i];
        }

        int[] rightArray = new int[array.length-mid];
        for (int i =mid;i<array.length;i++){
            rightArray[i-mid] = array[i];
        }

        MergeSortMain(leftArray);
        MergeSortMain(rightArray);
        Merge(array,leftArray,rightArray);
        return array;
    }

    private static void Merge(int[] array, int[] leftArray, int[] rightArray) {

        int nL = leftArray.length;
        int nR = rightArray.length;
        int i=0,j=0,k=0;

        while(i<nL && j<nR){
            if (leftArray[i]<rightArray[j]){
                array[k]=leftArray[i];
                i++;
            }
            else {
                array[k]=rightArray[j];
                j++;
            }
            k++;
        }

        while (i<nL){
            array[k]=leftArray[i];
            k++;
            i++;
        }
        while (j<nR){
            array[k]=rightArray[j];
            k++;
            j++;
        }
    }
}
