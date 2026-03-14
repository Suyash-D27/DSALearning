package linklist.SingllyLinkList;


import java.lang.classfile.attribute.LineNumberTableAttribute;

public class mergeSort {


    public ListNode sortList(ListNode head) {
            if (head==null||head.next==null){
                return head;
            }

            ListNode mid = middleNode(head);
            ListNode right = sortList(head);
            ListNode left = sortList(mid);

            return mergeTwoLists(right,left);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tail.next= list1;
                list1= list1.next;
            }else {
                tail.next= list2;
                list2= list2.next;
            }
            tail=tail.next;
        }
        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }

        return dummyHead.next;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    // revserse linklist 2

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        ListNode current = head;
        ListNode perv = null;

        // skip to l-1 time

        for (int i = 0; current!= null && i < left-1 ; i++) {
            perv =current;
            current= current.next;
        }

        ListNode last = perv;
        ListNode newend =  current;
        ListNode next = current.next;

        for (int i = 0; current!=null &&  i < right-left+1 ; i++) {
            current.next=perv;
            perv=current;
            current=next;
            if(next.next!=null){
                next=next.next;
            }
        }

        if(last != null){
            last.next = perv;
        }else {
            head =perv;
        }

        newend.next=current;

        return head ;
    }

    public boolean ispallandrom (ListNode head){

        ListNode mid = middleNode(head);
        ListNode secondhead = reversList(mid);
        ListNode reveseredhead = secondhead;

        while (head!=null && secondhead!=null){
            if(head.val!=secondhead.val){
                return false;
            }
            head = head.next;
            secondhead=secondhead.next;
        }
        reversList(reveseredhead);
        return true;
    }


    public ListNode reversList (ListNode head){
        ListNode pre = null;
        ListNode current = head;
        ListNode next = null;

        while(current != null){
            next = current.next;
            current.next=pre;
            pre=current;
            current=next;

        }

        head =pre;
        return head;
    }

    //leetcode 143

    public void reorderList(ListNode head) {
        if (head==null || head.next ==null){
            return;
        }
        ListNode head1 = head;
        ListNode mid = middleNode(head);
        ListNode head2 = reversList(mid);

        while (head2!=null && head1!=null){
            ListNode temp = head1.next;
            head1.next=head2;
            head1=temp;
            temp = head2.next;
            head2.next=head1;
            head2=temp;
        }


        if(head1!=null){
            head1.next=null;
        }

    }
    // rotate for right question in 61

    public ListNode rotateRight(ListNode head, int k) {
        if(k<0 || head == null|| head.next==null){
            return head;
        }

        ListNode Last = head;
        int lenght = 1;

        while (Last.next!=null){
            Last=Last.next;
            lenght++;
        }

        Last.next=head;
        int roation = k%lenght;
        int move = lenght-roation;
        ListNode newlast = head;

        for (int i = 1; i <=move ; i++) {
            newlast=newlast.next;
        }

        head=newlast.next;
        newlast.next=null;


        return head;

    }


     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
}

