package arrays.sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class questions {
    public static void main(String[] args) {
        int []arr={1,2,2,4};

        System.out.println(question5(arr));
    }

      static int question1(int[]arr){
        int i=0;
            while(i< arr.length){
                int correct=arr[i]-1;
                if (arr[i]<arr.length && i!=arr[i]+1){
                    swap(arr,i,correct);
                }
                else i++;
            }
        for (int index = 0; index < arr.length ; index++) {
            if (arr[index]!=index){
                return index;
            }
        }
        return arr.length;

    }

      static void swap(int[] arr, int start, int end) {
        int temp=0;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

      static List<Integer> questionn2(int[]arr){
        int i=0;
        List<Integer> ans = new ArrayList<>();
        while (i< arr.length){
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            }
            else i++;
        }

        for (int index = 0; index < arr.length ; index++) {

            if (arr[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

      static int question3(int[]arr){//finding duplicate
          int i=0;
          while(i< arr.length){
              int correct=arr[i]-1;
              if(arr[i]!=i+1){
                  if (arr[i]!=arr[correct]){
                      swap(arr,i,correct);
                  }
                  else return arr[i];
              }else i++;

              }
          return -1;
      }

      static int[] question4(int[] arr){
          int i=0;
          while(i< arr.length){
              int correct=arr[i]-1;
              if (arr[i]!=arr[correct]){
                  swap(arr,i,correct);
              }
              else i++;
          }
          for (int index = 0; index < arr.length ; index++) {
              if (arr[index]!=index+1){
                  return new int [] {arr[index],index+1};
              }
          }
          return new int[] {-1,-1};
      }

      static int question5(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct =arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
               swap(arr,i,correct);
            }else i++;
        }
        int ans;
          for (int index = 0; index < arr.length; index++) {
              if(arr[index]!=index+1){
                   return index+1;
              }
          }
          return arr.length+1;
      }
}
