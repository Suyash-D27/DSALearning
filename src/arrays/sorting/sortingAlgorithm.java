package arrays.sorting;

import java.util.Arrays;

public class sortingAlgorithm {
    public static void main(String[] args) {
        int[]arr={12,23,43,53,32,45,78,98,67,99};
//        Bubblesort(arr);
//          selectionSort(arr);
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void Bubblesort (int[]array){

        boolean swapped ;

        // run the steps n-1 times
        for (int i = 0; i < array.length; i++) {
            // for each steps max item will come to the last repective element
            swapped=false;
            for (int j = 1; j <array.length-i-1 ; j++) {
                // swap if element is smaller the pervious item
                if(array[j]<array[j-1]){
                    //swap
                    int temp;
                    temp = array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    swapped=true;
                }
            }
            // if didi not sappwed for a particular value of i it means the array is sorted so stop the program
            if (!swapped) break;
        }

    }

    static void selectionSort (int[]arr) {
        for (int i = 0; i < arr.length; i++) {


            // find the max item in the remaing array and swap it with correct index
            int last = arr.length-i-1;
            int max = getmaxindex(arr,0,last);

            swap(arr,max,last);

        }
    }

    static void swap (int[] arr,int first , int second){
      int temp = arr[first];
      arr[first]=arr[second];
      arr[second]=temp;
    }

     static int getmaxindex(int[] arr, int start, int end)   {
        int max = start;
        for (int j = start; j <=end ; j++) {
            if(arr[max]<arr[j]) {
                 max=j;
            }
        }

        return max;
    }

    static void insertionsort(int[]arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else break;
            }
        }
    }
}
