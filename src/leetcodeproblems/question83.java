package leetcodeproblems;

import linklist.SingllyLinkList.LL;

public class question83 {
    class LL{

        Node head;
        Node tail;
        int size;

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

        private class Node {
            int val;
            Node next;

            public Node(int val) {
                this.val = val;
            }

            public Node(int val, Node next) {
                this.next = next;
                this.val = val;
            }
        }
    }
}
