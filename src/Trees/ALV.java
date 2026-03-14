package Trees;

import java.util.zip.CheckedInputStream;

class AVL {
    class Node {
        private int value;
        private Node right;
        private Node left;
        private int hight;

        public Node(int value){
            this.value=value;
        }
        public int getValue(){
            return value;
        }
    }

    private Node root ;

    public AVL(){
    }

    public int  hight(){
       int res = hight(root);
       return res;
    }

    public int hight (Node node){
        if(node==null){
            return -1;
        }
        return node.hight;
    }

    public boolean isempty(){
        return root==null;
    }
    public void display(){
        display(root,"rootnode :");
    }
    public void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getValue());
        display(node.left,"leftchild is of "+node.getValue()+" is ");
        display(node.right,"rightchild is of "+node.getValue()+" is ");
    }


    public void insert(int value){
        root = insert(root,value);
    }

    public Node insert(Node node ,int value){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value<node.getValue()){
            node.left= insert(node.left,value);
        }
        if(value>node.getValue()) {
            node.right=insert(node.right, value);
        }

        node.hight = Math.max(hight(node.left),hight(node.right))+1;

        return rotate(node);

    }

    private Node rotate (Node node){
        if(hight(node.left)-hight(node.right)>1){
            // left heavy
            if(hight(node.left.left)-hight(node.left.right)>0){
                //left-left case we do right rotation on parent node
                return rightrotate(node); // rigth rotation see diagram in copy
            }
            if(hight(node.left.left)-hight(node.left.right)<0){
                //left-right case see daigram in copy
                node.left = leftrotate(node.left); // first left rotation ; first we do left roation on child node then
                return rightrotate(node); // then right rotation we right rotation on parent node
            }
        }
        if(hight(node.left)-hight(node.right)<-1){
            // left heavy
            if(hight(node.right.right)-hight(node.right.left)>0){
                //right-right case we do left roation on partent node
                return leftrotate(node); // rigth rotation see diagram in copy
            }
            if(hight(node.right.right)-hight(node.right.left)<0){
                //left-right case see daigram in copy
                node.right= rightrotate(node.right); // first left rotation ; first we do right rotation on child node then
                return leftrotate(node); // then right rotation
            }
        }

        return node;
    }

    public Node rightrotate(Node p){
        Node c= p.left;
        Node temp = c.right;
        c.right = p;
        p.left = temp;

        p.hight = Math.max(hight(p.left), hight(p.right)) +1;
        c.hight = Math.max(hight(c.right), hight(c.left))+1;

        return c;

    }

    public Node leftrotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left =c;
        c.right = t;

        p.hight = Math.max(hight(p.left), hight(p.right)) +1;
        c.hight = Math.max(hight(c.right), hight(c.left))+1;


        return p ;
    }

    public void populate(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            insert(arr[i]);
        }
    }

    public void populatedsorted(int[] nums){
        populatedsorted(nums,0, nums.length-1);
    }

    private void populatedsorted(int[] nums, int s, int e){
        int m = s+(e-s)/2;
        if(s>=e){
            return;
        }
        insert(nums[m]);
        populatedsorted(nums,s,m);
        populatedsorted(nums,m+1,e);
    }

    public boolean isblanced (){
        return isblanced(root);
    }

    public boolean isblanced(Node node){
        if(node==null){
            return true;
        }

        return Math.abs(hight(node.left)-hight(node.right))<=1&&isblanced(node.right)&&isblanced(node.left);
    }


    public void preorder (){
        preorder(root);
    }

    private void preorder (Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(){
        inorder(root);
    }

    private void inorder(Node node) {
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.value+" ");
        inorder(node.right);
    }
    public void postorder(){
        postorder(root);
    }

    private void postorder(Node node) {
        if(node==null){
            return;
        }
        inorder(node.left);
        inorder(node.right);
        System.out.print(node.value+" ");
    }


}
