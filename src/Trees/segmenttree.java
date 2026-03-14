package Trees;

public class segmenttree {

    public static void main(String[] args) {

    }

    class Node {
        int data ;
        int startinterval ;
        int endinterval;
        Node left;
        Node right;

        public Node (int startinterval , int endinterval){
            this.startinterval = startinterval;
            this.endinterval = endinterval;
        }
    }

    Node root;

    public segmenttree(int[] arr){
        this.root = populate (arr , 0 , arr.length-1 );
    }

    private Node populate ( int[] arr , int start , int end ){
        if(start == end ){
            Node leaf = new Node (start, end);
            leaf.data = arr[start];
//            leaf.startinterval =start;
//            leaf.endinterval=end;
            return leaf;
        }

        // create new node

        Node node = new Node(start, end);

        int mid = start+(end -start)/2;

        node.left = this.populate(arr , start , mid);
        node.right = this.populate(arr,mid+1,end );

        node.data = node.left.data+node.right.data;

        return node;
    }

    public void display (){
        display(root);
    }

    private void  display (Node node){
        String str ="";
        //for left child
        if(node.left != null ){
            str = str + "interval [" + node.left.startinterval +"-"+ node.left.endinterval +"] and node data " + node.left.data +"=>" ;
        }else {
            str = str+"no  left child =>";
        }
        // for current Node
        str = str + "interval [" + node.startinterval +"-"+ node.endinterval +"] and node data " + node.data +"<=" ;

        // for rght child

        if(node.right!= null ){
            str = str + "interval [" + node.right.startinterval +"-"+ node.right.endinterval +"] and node data " + node.right.data  ;
        }else {
            str = str+"no  left child";
        }

        System.out.println(str);


        // recusrrion
        if(node.left!=null){
            display(node.left);
        }

        if(node.right!=null){
            display(node.right);
        }
    }


    // query

    // qsi => query start interval and qei = query end interval

    public int query (int qsi , int qei) {
        return query(this.root, qsi, qei);
    }

    private int query( Node node , int qsi , int qei){
        if(node.startinterval>= qsi && node.endinterval<= qei){
            // node complety ying nsde the query interval
            return node.data;
        }else if (node.startinterval>qei || node.endinterval< qsi){
            return 0;
        }else{
            return this.query(node.left , qsi , qei) + this.query(node.right,qsi,qei);
        }
    }


    // update
    public void update (int index ,int value){
     this.root.data = update(this.root , index , value);
    }

    private int update(Node node , int index , int value){
//        // update
//        if(node.startinterval== index && node.endinterval==index){
//            node.data =value;
//        }
//        //searching
//        if(node.right.startinterval<index && node.right.endinterval>index && node.right!=null){
//            update(node.right,index,value);
//            node.data = node.right.data+node.left.data;
//        }else if(node.left!=null) {
//            update(node.left, index, value);
//            node.data= node.right.data+node.left.data;
//        }


        if(node.startinterval<=index && node.endinterval>=index ){
            if(node.startinterval== index && node.endinterval==index){
                return node.data =value;
            }else{
                int leftans = update(node.left, index, value);
                int rightans = update(node.right,index,value);
                return leftans+rightans;
            }
        }
        return node.data;
    }





}
