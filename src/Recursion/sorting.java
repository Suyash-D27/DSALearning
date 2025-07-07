package Recursion;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int [] arr ={1,4,2,3};
        slectionsort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void bubblesort (int [] arr,int s, int e){
        if(e==0){
            return ;
        }
        if (s<e){
            if(arr[s]>=arr[s+1]){
                // swap
                int temp = arr[s];
                arr[s] = arr[s+1];
                arr[s+1]=temp;
            }
            bubblesort(arr,s+1,e);
        }else {
            bubblesort(arr,0,e-1);
        }
    }

    static void swap(int [] arr ,int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e]=temp;
    }

    static int maxindex(int [] arr,int s,int e){
        int max=arr[s];
        int maxid=s;
        for ( int i = 0; i<=e; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxid=i;
            }
        }
        return maxid;
    }

    static void slectionsort (int [] arr,int s,int e){
        if(s>=e){
            return;
        }
        int maxid=maxindex(arr,s,e);
        swap(arr,maxid,e);
        slectionsort(arr,s,e-1);
    }
}
