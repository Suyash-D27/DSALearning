package leetcodeproblems;

import java.util.ArrayList;
import java.util.List;

public class question17 {
    public static void main(String[] args) {
        System.out.println( pad2("","19"));
    }

    static void pad ( String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0)-'0';

        for (int i = (digit-1)*3; i <(digit)*3 ; i++) {
            char ch = (char)('a'+i);
            pad(p+ch,up.substring(1));
        }

    }

    static ArrayList<String> pad2 (String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();

        int digit = up.charAt(0)-'0';
       if (digit==9){
        for (int i = (digit-1)*3; i <(digit)*3-1 ; i++) {
            char ch = (char)('a'+i);
            ans.addAll(pad2(p+ch,up.substring(1)));
        }
       }
       else {
           for (int i = (digit-1)*3; i <(digit)*3 ; i++) {
               char ch = (char)('a'+i);
               ans.addAll(pad2(p+ch,up.substring(1)));
           }
       }
       return ans;

    }
}
