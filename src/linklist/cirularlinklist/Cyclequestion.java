package linklist.cirularlinklist;

public class Cyclequestion {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public int countCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
               ListNode temp = slow;
               int length =0;

               do {
                   temp=temp.next;
                   length ++;
               } while (temp!=slow);
               return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        int lenght = countCycle(head);

        if(lenght==0) return null;

        ListNode f = head;
        ListNode s = head;

        while (lenght>0){
            s=s.next;
        }

        while (f!=s){
            f=f.next;
            s=s.next;
        }

        return s;

    }

    // Question 3

    public boolean isHappy(int n) {
        int slow =n;
        int fast=n;

        do{
            slow= squarRem(slow);
            fast= squarRem(squarRem(fast));
        }while (slow != fast);


        if(slow==1){
            return true;
        }

        return false;
    }

    private int squarRem (int num){
        int ans=0;
        while (num>0){
            int rem = num%10;
            num /= 10;
            ans += rem*rem;
        }
        return ans;
    }

    // Question 4

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

    }
}
