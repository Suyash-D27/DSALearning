package Recursion;

public class lec1 {
    public static void main(String[] args) {
        print(1);
        System.out.println(fibonachi(4));

    }
    static void print (int n){
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }

    static int  fibonachi (int n){
        if (n<2){
            return n;
        }

        return fibonachi(n-1)+fibonachi(n-2);
    }


    static int Bsearch (int[] arr, int target, int s, int e){

        if (s>e) return -1;
        int mid=s+(e-s)/2;
            if (arr[mid]==target) return mid;
            if (arr[mid]>target){
                return Bsearch(arr,target,s,mid-1);
            }
            return Bsearch(arr,target,mid+1,e);



    }

}
