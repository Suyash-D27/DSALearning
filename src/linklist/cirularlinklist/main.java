package linklist.cirularlinklist;

public class main {
    public static void main(String[] args) {
        CLL list = new CLL();

        list.insert(23);
        list.insert(19);
        list.insert(45);
        list.insert(2);
        list.delete(45);
        list.display();


    }
}
