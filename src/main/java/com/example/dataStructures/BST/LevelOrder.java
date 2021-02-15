package com.example.dataStructures.BST;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    public class Node {
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    public Node root=null;

    public void insert(int data){
        root=addNode(data,root);
    }

    public Node addNode(int data,Node root){
        Node newNode= new Node(data);

        if(root==null) return newNode;
        else if(data<root.data) root.left=addNode(data,root.left);
        else if(data>root.data) root.right = addNode(data,root.right);
        return root;
    }

    public void preorder(){
        printPreorder(root);
    }

    public void inorder(){
        printInorder(root);
    }

    public void printInorder(Node root){
        if (root==null) return;
        Queue<Node> inorder = new LinkedList<Node>();
        inorder.add(root);
        while(!inorder.isEmpty()){
            Node current = inorder.peek();
            System.out.println(current.data);
            if(current.left!=null) inorder.add(current.left);
            if(current.right!=null) inorder.add(current.right);
            inorder.poll();
        }
    }

    public int height(Node root){
        if (root==null) return -1;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public void printPreorder(Node root){
        if(root==null) return;
        System.out.println(root.data+" "+height(root));
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {
        int[] res={1,2,3,4,5,6,7};

        LevelOrder tree = new LevelOrder();

        tree.insert(4);tree.insert(2);tree.insert(6);tree.insert(1);tree.insert(3);
        tree.insert(5);tree.insert(7);
//        tree.preorder();
        tree.inorder();
    }
}
