package Trees;

import java.util.Scanner;

public class binaryTree {

    public binaryTree(){

    }
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node (int value){
            this.value=value;
        }
    }

    private Node root;

    // insert

    public void populate (Scanner scanner){
        System.out.println("Enter the value of root ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    public void populate (Scanner scanner, Node node){
        System.out.println("Do you want to add in left of " + node.value);
        boolean isleft = scanner.nextBoolean();
        if(isleft){
            System.out.println("enter the value ");
            int value= scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to add in right of " + node.value);
        boolean isright = scanner.nextBoolean();
        if(isright){
            System.out.println("enter the value ");
            int value= scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }
    }


    // Display


    public void display(){
        display(root," ");
    }
    private void display(Node node, String indent){
        if(node==null) return;
        System.out.println(indent+node.value );
        display(node.left , indent+"\t");
        display(node.right,indent+"\t");
    }

}
