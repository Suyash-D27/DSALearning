package Recursion;

import java.util.ArrayList;
import java.util.List;

public class questionspart2 {
    public static void main(String[] args) {
        // subset("","abc");
//        System.out.println(subsetwithAscilvaule("","ab"));
          int [] arr = {1,2,3};
          List<List<Integer>> ans = subset2(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }

      
    }

    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch =up.charAt(0);

        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
    }

    static ArrayList<String> subsetb(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);

        ArrayList<String> left = subsetb(p+ch,up.substring(1));
        ArrayList<String> right =subsetb(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    static ArrayList<String> subsetwithAscilvaule(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);

        ArrayList<String> left = subsetwithAscilvaule(p+ch,up.substring(1));
        ArrayList<String> right =subsetwithAscilvaule(p,up.substring(1));
        ArrayList<String>  asci =subsetwithAscilvaule(p+(ch+0),up.substring(1));
        left.addAll(right);
        left.addAll(asci);
        return left;
    }
   // without recursion


    static List<List<Integer>> subset2 (int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num :arr){
            int n =outer.size();
            for (int i = 0; i <n ; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }


}
 