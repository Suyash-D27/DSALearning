package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class lecture1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        //syntax
        //datatype [] variableName = new dataType [size];
        // store 5 roll no
//        int [] roll ;// declaration of array
//        roll =new int [5]; // here memroy is createdn
//        // or you can dirctely store the values
//        int [] roll2  = {12,23,45,67,76};
//        // all the type of data should be same

//        int [] arr = new int [5];
//
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i]= in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

//        for (int num : arr) { // for evrey elment of array print the element
//            System.out.println("arr" + num);//here num represent element of array
//        }


// Array of objects
//    String[] str = new String[4];
//
//        for (int i = 0; i < str.length ; i++) {
//            str[i]=in.next();
//        }
//        System.out.println(Arrays.toString(str));


        // 2D arrays
//             int [][] arr2D = {
//                     {1,2,3},
//                     {4,5,6},
//                     {7,8,9}
//             };

//             int[][] arr2D = new int[3][2];
//
//        System.out.println(arr2D.length);//no of rows
//
//        for (int row= 0; row < arr2D.length; row++) {
//                //for every col i have to input
//            for (int col = 0; col < arr2D[row].length; col++) {
//                arr2D[row][col]= in.nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(arr2D));

//        // for printing the array
//        for (int row = 0; row <arr2D.length; row++) {
//            for (int col = 0; col <arr2D[row].length; col++) {
//                System.out.print(arr2D[row][col]+" ");
//            }
//            System.out.println();
//        }


        // Dynamic array
//        int [][] arra = {
//                {1,24,34},
//                {3,4},
//                {56,34,78,46}
//
//        };
//
//        for (int row = 0; row <arra.length ; row++) {
//            for (int col = 0; col < arra[row].length; col++) {
//                System.out.print(arra[row][col]+" ");
//            }
//            System.out.println();
//        }

        // Array list

        //syntax
//        ArrayList<Integer> list= new ArrayList<>(10);
//        list.add(67);
//        list.add(34);
//        list.add(89);
//        list.add(56);
//        list.add(45);
//        list.add(35);
//        list.add(56);
//        list.add(35);
//        list.add(45);
//        list.add(23);
//        //add for then 10 items
//        System.out.println(list.contains(23));
//
//        System.out.println(list);
//        //replace
//        //(index, number you want)
//        list.set(2,100);
//        System.out.println(list);
//        //remove
//        list.remove(1);
//        System.out.println(list);
//        //input
//        for (int i = 0; i <6; i++) {
//            list.add(in.nextInt());
//        }
//        System.out.println(list);
//        // get any item
//        list.get(4);

        // 2d array list

        ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();

        // initialisation

        for (int i = 0; i < 3; i++) {
            list2d.add(new ArrayList<>(i));
        }

        //add number oor elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                list2d.get(i).add(in.nextInt());
            }
            System.out.println();
        }
        System.out.println(list2d);
   }



}



