package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraypractices {
   static int [] arr ={1,23,34,35,45,18};

    static void Question1Swaping (int[] arr , int index1, int index2 ){
        int temp = arr [index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    static void Question2Max(int[] arr){
        int max_arr=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max_arr) {
                max_arr=arr[i];
            }
        }
        System.out.println("max is "+max_arr);
    }


    // what so worng in this code ??
//    static void Question3ReversArray (int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int temp = arr[i];
//            arr[(arr.length-1)-i]=arr[i];
//            arr[(arr.length-1)-i]=temp;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
    // Answer : Data loss while swaping
    //arr[i]=arr[(arr.length-1)-i] is this correct


static void Question3ReversArray (int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start<end){
         Question1Swaping(arr,start,end);
         start++;
         end--;
        }

    System.out.println(Arrays.toString(arr));
}


    public static void main(String[] args) {
//            Question1Swaping(arr,1,3);
//            Question2Max(arr);
//        System.out.println(Arrays.toString(arr));
        Question3ReversArray(arr);

    }
}
