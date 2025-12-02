package linklist.DoubllyLinlist;

import linklist.SingllyLinkList.LL;

public class main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFrist(3);
        list.insertFrist(21);
        list.insertFrist(34);
        list.insertFrist(13);
        list.insertLast(42);
        list.insert(34,28);
        list.display();
    }

}
