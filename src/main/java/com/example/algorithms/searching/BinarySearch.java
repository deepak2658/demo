package com.example.algorithms.searching;

public class BinarySearch {

    public static boolean check=false;

    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,7,8,9,0};

        int index = binarySearch(array,5);
        binarySearchRecursive(array,3,0,array.length-1);

        if (check==true) System.out.println("Number found at index "+index);
        else System.out.println("Number not found");

        if (index!=-1){
            System.out.println("Number found at index "+index);
        }
        else System.out.println("Number not found");
    }



    private static void binarySearchRecursive(int[] array, int x,int start, int end) {

        if (start>end){
            return;
        }
        int mid = start +(end-start)/2;
        if (array[mid]==x){
            check =true;
            return;
        }
        else if (x>array[mid]){
                binarySearchRecursive(array,x,mid+1,end);
            }
        else {
                binarySearchRecursive(array,x,start,mid-1);
            }

    }

    public static int binarySearch(int[] array,int x){
        int start = 0;
        int end = array.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;

            if(array[mid]==x){
                return mid;
            }
            else if (x>array[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
