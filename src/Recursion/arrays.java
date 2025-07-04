package Recursion;

import java.util.ArrayList;

public class arrays {

    public static void main(String[] args) {
        int [] arr= {4,5,6,7,8,1,2,3};
//        System.out.println(Lserlist(arr,4,0));
        int ans=Bsearch(arr,2,0,arr.length-1);
        System.out.println(ans);
    }

    static boolean sorted(int arr[], int index){
        // base condtion
        if (index ==arr.length-1) {
            return true;
        }
      return arr[index]<=arr[index+1] && sorted(arr,index+1);

    }

    static int linerSer(int [] arr, int target,int index){
        if (index== arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return linerSer(arr,target,index+1);
    }

    static ArrayList<Integer> list=new ArrayList<>();
    static ArrayList<Integer> linerSerlist(int [] arr, int target, int index, ArrayList<Integer> list){
        //base condition
        if (index== arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        return linerSerlist(arr,target,index+1, list);
    }

    static ArrayList<Integer> Lserlist(int [] arr, int target,int index ){
        // not a optimal apporoch
        ArrayList<Integer> list2 = new ArrayList<>();
        if (index== arr.length){
            return list2;
        }
        if (arr[index]==target){
            list2.add(index);
        }

        ArrayList<Integer> answerformbelowcall= Lserlist(arr,target,index+1);

        list2.addAll(answerformbelowcall);

        return list2;

    }

    static int Bsearch(int[] arr, int target,int s,int e){
        if (s>e){
            return -1;
        }
        int m = s+(e-s/2);

        if (arr[m]==target) return m;

        if (arr[s]<arr[m]){
            if(target>=arr[s]&&target<=arr[e]){
                return Bsearch(arr,target,s,m-1);
            }
             return Bsearch(arr,target,m+1,e);
        }

        if (target>=arr[m]&&arr[s]<=arr[e]){
            return Bsearch(arr,target,m+1,e);

        }
        else return Bsearch(arr,target,s,m-1);

    }


}
