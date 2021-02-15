package com.example.dataStructures.BST;

public class InoderSuccessorBST {
    public class BSTNode{
        int data;
        BSTNode left,right;
        BSTNode(int data){
            this.data= data;
            this.left=this.right=null;
        }
    }

    public BSTNode root = null;

    public void addNode(int data){
        root = insert(root,data);
    }

    public BSTNode insert(BSTNode root,int data){
        BSTNode newNode = new BSTNode(data);

        if(root == null){
            return root=newNode;
        }
        if(data<root.data){
           root.left =  insert(root.left,data);
        }
        else if(data>root.data){
            root.right = insert(root.right,data);
        }

        return root;
    }

    public void inorder(){
        printInorder(root);
    }

    public void printInorder(BSTNode root){
        if (root==null) return;
        printInorder(root.left);
        System.out.println(root.data);
        printInorder(root.right);
    }

    public void postorder(){
        printPostorder(root);
    }

    public void printPostorder(BSTNode root){
        if (root==null) return;
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.println(root.data);
    }

    public void preorder(){
        printPreorder(root);
    }

    public void printPreorder(BSTNode root){
        if (root == null) return;
        System.out.println(root.data);
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public void inorderSuccessor(int data){
        BSTNode currentNode = findCurrent(root,data);

        if (currentNode==null){
            System.out.println("Element not found");
            return;
        }
        if (currentNode.right!=null){
            BSTNode temp = currentNode.right;
            while(temp.left!= null){
                temp=temp.left;
            }
            System.out.println(temp.data);
        }
        else {
            BSTNode successor = null;
            BSTNode ancestor = root;
            while(ancestor!=currentNode){
                if (currentNode.data< ancestor.data){
                    successor=ancestor;
                    ancestor=ancestor.left;
                }
                else {
                    ancestor=ancestor.right;
                }
            }
            if (successor!=null) {
                System.out.println(successor.data);
            }
            else{
                System.out.println("NO Succssor for this node");
                return;
            }
        }
    }

    public BSTNode findCurrent(BSTNode root,int data){
        if(root == null) return null;
        else if(root.data == data) return root;
        else if(root.data < data) return findCurrent(root.right,data);
        else return findCurrent(root.left,data);
    }

    public static void main(String[] args) {
        InoderSuccessorBST newbst = new InoderSuccessorBST();

        newbst.addNode(15);newbst.addNode(10);newbst.addNode(8);
        newbst.addNode(6);newbst.addNode(12);newbst.addNode(11);
        newbst.addNode(20);newbst.addNode(17);newbst.addNode(16);
        newbst.addNode(25);newbst.addNode(27);

//        newbst.inorder();   //Inorder always prints the BST sorted
//        newbst.postorder();
//        newbst.preorder();

        newbst.inorderSuccessor(10);
        newbst.inorderSuccessor(12);
        newbst.inorderSuccessor(27);
    }
}
