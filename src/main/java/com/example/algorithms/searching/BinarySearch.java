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

        int[] array2 = {1,2,3,4,5,5,5,5,6,7,8,9,9,0};

        int firstOccurrence = binaryFirstOccurence(array2,5);
        System.out.println("first occurrence id at index "+firstOccurrence);

        int lastOccurrence = binarySearchLastOccurrence(array2,5);
        System.out.println("last occurrence id at index "+lastOccurrence);

        System.out.println("no of occurrence of 5 is "+countOccurrence(array2,5));
    }

    private static int countOccurrence(int[] array, int x) {

         int count = binarySearchLastOccurrence(array,x) - binaryFirstOccurence(array,x)+1;
        return count;
    }

    public static int binarySearchLastOccurrence(int[] array,int x){
        int result = -1;

        int start = 0;
        int end = array.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if (array[mid]==x){
                result = mid;
                start = mid+1;
            }else if (x>array[mid]){
                start = mid+1;
            }else end = mid-1;
        }
        return result;
    }

    public static int  binaryFirstOccurence(int[] array,int x){
        int result = -1;

        int start = 0;
        int end = array.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if (array[mid]==x){
                result=mid;
                end = mid-1;
            }else if (x>array[mid]){
                start = mid+1;
            }
            else end = mid-1;
        }

        return result;
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
