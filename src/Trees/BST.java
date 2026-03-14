package Trees;

public class BST {
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

    public BST(){
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

        if(value>node.getValue()){
           node.left= insert(node.left,value);
        }
        if(value<node.getValue()) {
            node.right=insert(node.right, value);
        }

        node.hight = Math.max(hight(node.left),hight(node.right))+1;

        return node;

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
