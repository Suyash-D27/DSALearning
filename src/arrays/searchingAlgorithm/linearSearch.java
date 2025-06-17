package arrays.searchingAlgorithm;

import java.util.Arrays;

public class linearSearch {
    public static void main(String[] args) {
//        int[]array={1,2,5,9,76,98,65,89,67};
//            int traget = 98;
//            int ans=searchAlgo(array,traget);
//        System.out.println(ans);
//        String name="suyash";
//        char traget2= 'u';

//        int ans2 = searchInRange(array,traget,3,7);
//        System.out.println(ans2);

//        int [] formin ={23,23,456,67,76,34,56,78};
//        int ans3 = min(formin);
//        System.out.println(ans3);


//        int [][] arr2 = {
//                {2,3,45,5},
//                {1,5,6,1,4},
//                {4,8}
//        };
//
//        int traget3= 5;
//        int []ans4=searchIn2DArraya(arr2,traget3);
//        System.out.println(Arrays.toString(ans4));
//
//        System.out.println(MaxIn2DArray(arr2));

        int []array5={1,2,4,5,6,7,3,5,8,10,34,54,87};
        int[]ans5=EvenNumbersOnly(array5);
        System.out.println(Arrays.toString(ans5));
    }


    static int searchAlgo (int [] arr,int traget){

        if (arr.length==0){
            return -1;
        }

            for (int index = 0; index < arr.length; index++) {
                int element= arr[index];
                if (element==traget){
                    return index;
                }
            }
            return -1;
        }

    static boolean searchString( String str,char traget2){
          if (str.length()==0){
              return false;
          }
        for (int i = 0; i < str.length(); i++) {
            if (traget2==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static int searchInRange (int[] arr, int traget, int start, int end){
        if (arr.length==0) return -1;

        if (end>arr.length) return -1;

        for (int index = start; index <= end; index++) {
            int element= arr[index];
            if (element==traget){
                return index;
            }
        }
        return -1;

    }

    static int min (int[] arr){
        int ans = arr[0];
        for (int index = 0; index < arr.length ; index++) {
            if (arr[index]<ans) ans=arr[index];
        }
        return ans;
    }

    static int[] searchIn2DArraya(int [][] arr,int traget){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==traget) return new int[] {row,col};
            }
        }
        return new int[]{-1,-1};

    }

    static int MaxIn2DArray(int [][] arr){
            int MAX=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>MAX) {
                    MAX = arr[row][col];
                }
            }
        }
        return MAX;

    }

    static int[] EvenNumbersOnly (int[] arr){

        int [] temp =new int[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0) {
                int[] temp2 = new int[temp.length + 1];

                for (int j = 0; j < temp.length; j++) {
                    temp2[j] =temp[j];
                }
                temp2[temp.length]=arr[i];

                temp=temp2;
            }
        }


        return temp;
    }



}
