package com.example.dataStructures.binaryTree;

import com.example.dataStructures.BST.LevelOrder;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeInsertion {
    public class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int data){
            this.data = data;
            this.left=this.right=null;
        }
    }

    public TreeNode root=null;

    public void insert(int data){
        root = addNode(root,data);
    }
    public TreeNode addNode(TreeNode root,int data){
        TreeNode newNode = new TreeNode(data);
        if(root==null) return newNode;

        Queue<TreeNode> levelOrder = new LinkedList<TreeNode>();
        levelOrder.add(root);

        while(!levelOrder.isEmpty()){
            TreeNode temp = levelOrder.peek();
            levelOrder.poll();
            if(temp.left==null){
                temp.left= newNode;
                break;
            }else {
                levelOrder.add(temp.left);
            }

            if(temp.right==null){
                temp.right= newNode;
                break;
            }else{
                levelOrder.add(temp.right);
            }
        }
        return root;
    }

    public void levelOrder(){
        printLevelOrder(root);
    }

    public void printLevelOrder(TreeNode root){
        if(root==null) return;
        Queue<TreeNode>  levelOrder = new LinkedList<TreeNode>();
        levelOrder.add(root);

        while(!levelOrder.isEmpty()){
            TreeNode temp = levelOrder.peek();
                System.out.println(levelOrder.poll().data);
                if(temp.left!=null){
                    levelOrder.add(temp.left);
                }
                if (temp.right!=null){
                    levelOrder.add(temp.right);
                }
        }
    }

    public static void main(String[] args) {
        TreeInsertion binaryTree = new TreeInsertion();
        binaryTree.insert(18);
        binaryTree.insert(15);binaryTree.insert(30);
        binaryTree.insert(40);binaryTree.insert(50);binaryTree.insert(100);binaryTree.insert(40);

        binaryTree.levelOrder();
    }
}
