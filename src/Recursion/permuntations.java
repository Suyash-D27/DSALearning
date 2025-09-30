package Recursion;

import java.util.ArrayList;

public class permuntations  {

    public static void main(String[] args) {
//        permunation("","abc");

        System.out.println(permunationlist("","abc"));
    }

    public static void permunation (String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String e = p.substring(i,p.length());

            permunation(f+ch+e,up.substring(1));
        }

    }


    public static ArrayList<String> permunationlist (String p, String up){

        if (up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String e = p.substring(i,p.length());

            ans.addAll(permunationlist(f+ch+e,up.substring(1)));
        }

        return ans;
    }

}
