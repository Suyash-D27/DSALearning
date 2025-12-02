package linklist.DoubllyLinlist;

import linklist.SingllyLinkList.LL;

public class DLL {
    private Node head;

    public void insertFrist (int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }

    public void display(){
        Node node = head;
        Node last =null;
        while (node!=null){
            System.out.print(node.val+"->");
            last= node;
            node=node.next;
        }
        System.out.println("END");

        System.out.println("In reverse");

        while (last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("START");
    }

    public void  insertLast (int val){
        Node last = head;
        Node newNode = new Node(val);
        if (head==null){
            newNode.prev=null;
            head=newNode;
            return;
        }
        while (last.next!=null){
            last = last.next;
        }
        newNode.next=null;
        last.next=newNode;
        newNode.prev=last;

    }


    public void insert (int after, int val){
        Node node = new Node(val);
        Node p = find(after);

        if(p==null){
            System.out.println("does not exist");
            return;
        }

        node.next=p.next;
        node.prev=p;
       if(p.next.prev!=null){
           p.next.prev=node;
       }
        p.next=node;

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




    private class Node {
        private int val ;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
