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

}
