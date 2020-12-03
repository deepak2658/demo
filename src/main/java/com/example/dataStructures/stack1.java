package com.example.dataStructures;

import com.sun.tools.jdeprscan.scan.Scan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
// Java program to demonstrate Polymorphism
import java.util.*;












public class stack1 {
    //Java has a built-in API named java.util.Stack.
    // Since char is a primitive datatype,
    // which cannot be used in generics, we have to use the wrapper class of java.lang.Character to create a Stack:
    //Stack<Character> charStack = new Stack<>(); Now we can push and pop as usual
    public  static void charStack() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(reader.readLine());
        for(int t=0 ; t<T;t++){
            char str[] = reader.readLine().toCharArray();
            Stack<Character> charStack = new Stack<>();
            for(char c: str){
                charStack.push(c);
            }
            Character cha = charStack.peek();
            System.out.println(cha);
        }
    }

    public static void main (String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
//        int T = scanner.nextInt();

//        for (int t=0;t<T;t++){
//           Stack<Integer> stack  = new Stack<Integer>();
//           int N= scanner.nextInt();
//           int[] array = new int[N];
//
//           for(int i=0;i<N;i++){
//               array[i] = scanner.nextInt();
//               stack.push(array[i]);
//           }
//           System.out.println(stack.peek());
//           System.out.println(stack.pop());
//        }
        charStack();


    }
}
