package com.example.dataStructures.BST;

public class BSTDelete {
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    public Node root = null;

    public void insert(int data){
        root = insert(root,data);
    }

    public Node insert(Node root,int data){
        if (root==null) {root=new Node(data);
            return root;
        }
        else if (data<root.data) {
            root.left = insert(root.left,data);
        }
        else if (data>root.data) {
            root.right= insert(root.right,data);
        }
        return root;
    }

    public void inorder(){
        printInorder(root);
    }

    public void printInorder(Node root){
        if (root==null) return;
        printInorder(root.left);
        System.out.println(root.data);
        printInorder(root.right);
    }

    public void preorder(){
        printPreorder(root);
    }

    public void printPreorder(Node root){
        if (root==null) return;
        System.out.println(root.data);
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public void inorderSuccessor(int data){
        Node successor = findsuccessor(root,data);
        if (successor!=null){
            System.out.println(successor.data);
        }
        else{
            System.out.println("element does not have a successor");
        }
    }

    public Node findsuccessor(Node root,int data){
        if (root==null) return null;
        Node current = find(root,data);
        if (current!=null){
            if (current.right!=null){
                Node temp = current.right;
                while(temp.left!=null) {
                    temp=temp.left;
                }
                return temp;
            }
            else {
                Node successor= null;
                Node ancestor = root;

                while(ancestor!=current){
                    if (current.data<ancestor.data){
                        successor = ancestor;
                        ancestor=ancestor.left;
                    }
                    else {
                        ancestor= ancestor.right;
                    }
                }
                if (successor!=null){
                    return successor;
                }
                else {
                    return null;
                }
            }
        }
        else return null;

    }

    public Node find(Node root,int data){
        if (root==null) return null;
        else if (root.data>data) return find(root.left,data);
        else if (root.data<data) return find(root.right,data);
        else return root;
    }

    public static void main(String[] args) {
        BSTDelete newbst = new BSTDelete();

        newbst.insert(15);newbst.insert(10);newbst.insert(8);
        newbst.insert(6);newbst.insert(12);newbst.insert(11);
        newbst.insert(20);newbst.insert(17);newbst.insert(16);
        newbst.insert(25);newbst.insert(27);

        newbst.inorder();   //Inorder always prints the BST sorted
//        newbst.postorder();
//        newbst.preorder();

        newbst.inorderSuccessor(10);
        newbst.inorderSuccessor(12);
        newbst.inorderSuccessor(27);
        delete(12);
    }

    private static void delete(int i) {
    }
}
