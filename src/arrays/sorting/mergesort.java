package arrays.sorting;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr= {23,4,5,2,56,345,623};
        method2(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr){
        if (arr.length==1){
            return arr;
        }

        int mid= arr.length/2;

        int [] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right =mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return  merge(left,right);
    }

    static int[] merge(int[] left,int[] right) {
        // this is for 2 sorterd array
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k++] = left[i++];

            } else {
                mix[k++] = right[j++];

            }

        }

        // if one of the loops complete
        //elelment is copyed as it is
        while (i < left.length) {
            mix[k++] = left[i++];
        }

        while (j < right.length) {
            mix[k++] = right[j++];
        }
        return mix;
    }

    static void method2(int[]arr,int s,int e){
        if (e-s<=1){
            return ;
        }

        int mid= s+(e-s)/2;

        method2(arr,s,mid);
        method2(arr,mid,e);

        mergeinplace(arr,s,mid,e);

    }

    private static void mergeinplace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e-s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j <e) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];

            } else {
                mix[k++] = arr[j++];

            }

        }
        while (i < mid) {
            mix[k++] = arr[i++];
        }

        while (j < e) {
            mix[k++] = arr[j++];
        }

        for (int l = 0; l < mix.length ; l++) {
            arr[s+l]=mix[l];
        }

    }
}
