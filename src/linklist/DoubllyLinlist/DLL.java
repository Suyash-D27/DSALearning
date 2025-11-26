package linklist.DoubllyLinlist;

public class DLL {
    Node head;

    public void insertFrist (int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=node;
        if(head!=null){
            head.prev=null;
        }
        head=node;
    }

    public void display(){
        Node node = head;
        while (node!=null){
            System.out.println(node.val+"->");
            node=node.next;
        }

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
