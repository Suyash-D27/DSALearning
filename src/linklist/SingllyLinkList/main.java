package linklist.SingllyLinkList;

public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFrist(3);
        list.insertFrist(21);
        list.insertFrist(34);
        list.insertFrist(13);
        list.insertLast(99);
        list.insert(133,3);
        list.display();
        System.out.println(list.deleteFrist());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.insertRec(33,2);

        list.display();
    }
}
