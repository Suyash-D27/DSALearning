package linklist.SingllyLinkList;

public class LL {


    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size=0;
    }

    public void insertFrist (int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if (tail==null){
            tail=head;
        }
        size+=1;

    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }

        System.out.println("END");
    }

    public void insertLast (int val){
        if (tail==null){
            insertFrist(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;

    }

    public void insert (int val , int index){
        if(index==0){
            insertFrist(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;

        for (int i = 0; i < index-1; i++) {
            temp=temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public void insertRec(int val, int index){
        head=insertRec(val,index,head);
    }

    private Node insertRec(int val , int index, Node node){

        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }

    public int deleteFrist(){
        int val = head.val;
        head= head.next;

        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if (size<=1){
            return deleteFrist();
        }
        Node secLastnode = get(size-2);
        int val=tail.val;
        tail=secLastnode;
        tail.next=null;

        return val;
    }

    public int delete (int index){
        if (index==0){
            return deleteFrist();
        }
        if (index==size){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.val;

        prev.next= prev.next.next;

        return val;

    }

    public Node find (int value ){
        Node node = head;
        while (node!=null){
            if (node.val==value){
                return node;
            }
            node = node.next;
        }

        return null;
    }

    public Node get (int index){
        Node node = head;
        for (int i = 0; i < index ; i++) {
            node=node.next;
        }

        return node;
    }

    private class Node {
        int val;
        Node next ;

        public Node(int val) {
            this.val = val;
        }

        public Node( int val,Node next) {
            this.next = next;
            this.val = val;
        }
    }


    // Question 1

    public void duplicates (){
        Node node = head;

        while (node.next!= null){
            if(node.next.val==node.val){
                node.next=node.next.next;
                size--;
            }else {
                node = node.next;
            }
        }

        tail=node;
        tail.next=null;
    }

    // Question 2

    public static LL merge (LL first , LL second ){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (s != null && f !=null) {
            if (f.val > s.val) {
                ans.insertLast(f.val);
                f = f.next;
            } else {
                ans.insertLast(s.val);
                s = s.next;
            }
        }

            while (f != null){
                ans.insertLast(f.val);
                f= f.next;
            }
            while (s != null){
                ans.insertLast(s.val);
                s= s.next;
            }

            return ans;

    }

    public void bubblesort(){
        bubblesort (size-1,0);
    }

    public void bubblesort (int row , int col){
        if(row==0){
            return;
        }
        if(col<row){
            Node f = get(col);
            Node s = get(col+1);
            if(f.val>s.val){
                // swap
                if(f==head){
                    head=s;
                    f.next=s.next;
                    s.next=f;
                } else if (s==tail) {
                    Node p =get(col-1);
                    p.next=s;
                    tail=f;
                    f.next=null;
                    s.next=tail;
                }else {
                    Node p = get(col-1);
                    p.next=s;
                    f.next=s.next;
                    s.next=f;
                }
            }

            bubblesort(row,col+1);

        }else {
            bubblesort(row - 1, col);
        }
    }


    public void revers (Node node){
        if(node == tail){
            head=tail;
            return;
        }
        revers(node.next);
        tail.next= node;
        tail=node;
        tail.next=node;
    }


    //inplace revers without recussion

    public void inplacerevers (){

        if (size<2){
            return;
        }

        Node pre = null;
        Node current = head;
        Node nextt = head.next;

        while(current != null){
            current.next=pre;
            pre=current;
            current=nextt;
            if(nextt.next!=null){
                nextt=nextt.next;
            }
        }



        head=pre;
    }



    public static void main(String[] args) {
        LL first = new LL();
        LL second  = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);



//        LL ans = LL.merge(first,second);
        System.out.println(second.size);
        second.bubblesort();

        second.display();
    }

}
