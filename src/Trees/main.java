package Trees;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        binaryTree tree= new binaryTree();
//        tree.populate(scanner);
//       tree.display();
//            BST tree = new BST();
//            int[] nums ={1,2,3,4,5,6,7,8,9};
//            tree.populatedsorted(nums);
//            tree.display();
//            tree.inorder();
//        System.out.println("");
//            tree.postorder();
//        System.out.println("");
//            tree.preorder();


//        AVL tree = new AVL();
//
//
//        for (int i = 0; i < 8; i++) {
//            tree.insert(i);
//        }
//
//        System.out.println(tree.hight());
//        tree.display();

        int[] arr = {1,2,3,2,1,-3,9};

        segmenttree tree  = new segmenttree(arr);

        tree.display();

        System.out.println(tree.query(2,5));

        tree.update(2,-5);

        tree.display();

        System.out.println(tree.query(2,5));

    }
}
