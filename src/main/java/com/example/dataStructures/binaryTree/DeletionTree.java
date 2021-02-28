package com.example.dataStructures.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class DeletionTree {
    public class TreeNode{
        int key;
        TreeNode left,right;
        TreeNode(int key){
            this.key = key;
            this.left=this.right=null;
        }
    }
    public TreeNode root= null;

    public void insert(int key){
        root = addNode(root,key);
    }
    public TreeNode addNode(TreeNode root,int key){

        TreeNode newNode = new TreeNode(key);
        if(root==null) return newNode;
        Queue<TreeNode> levelorder = new LinkedList<TreeNode>();
        levelorder.add(root);
        while(!levelorder.isEmpty()){
            TreeNode temp = levelorder.poll();
            if(temp.left==null) {
                temp.left= newNode;
                break;
            }
            else levelorder.add(temp.left);
            if(temp.right==null) {
                temp.right= newNode;
                break;
            }
            else levelorder.add(temp.right);
        }
        return root;
    }
    public void levelOrder(){
        printtree(root);
    }

    public void printtree(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> levelorder = new LinkedList<TreeNode>();
        levelorder.add(root);
        while(!levelorder.isEmpty()){
            TreeNode temp = levelorder.poll();
            System.out.println(temp.key);
            if(temp.left!=null) levelorder.add(temp.left);
            if(temp.right!=null) levelorder.add(temp.right);
        }
    }

    public void delete(int key){
        root = deleteNode(root,key);
    }
    public TreeNode deleteNode(TreeNode root,int key){
        if(root==null) return null;
        if(root.left==null&&root.right==null){
            if(root.key==key)return null;
            else return null;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        TreeNode temp=root,keyNode = null;
        while(!q.isEmpty()){
            temp = q.poll();
            if(temp.key==key){
                keyNode = temp;

            }
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        int x = temp.key;
        deleteDepest(root,temp);
        keyNode.key=x;
        return root;
    }
    public void deleteDepest(TreeNode root,TreeNode delNode) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        TreeNode temp = null;
        

        // Do level order traversal until last node
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp == delNode) {
                temp = null;
                return;

            }
            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else
                    q.add(temp.right);
            }

            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else
                    q.add(temp.left);
            }
        }
    }
    public static void main(String[] args) {
        DeletionTree tree = new DeletionTree();
        tree.insert(10);tree.insert(20);tree.insert(30);
        tree.insert(40);tree.insert(150);tree.insert(60);tree.insert(70);
        tree.levelOrder();
        tree.delete(150);
        tree.levelOrder();
    }
}
