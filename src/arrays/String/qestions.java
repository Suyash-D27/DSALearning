package arrays.String;

import java.util.Locale;

public class qestions {
    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(ispalindrome(str));
    }

    static boolean Ispalindrome (String str){ // kaam kar rha hai but not effective way
        str=str.toLowerCase();
        int start=0;
        int end=str.length()-1;
        while (str.charAt(end) == str.charAt(start)){
            start++;
            end--;
            if (start==end){
                if (str.charAt(end) == str.charAt(start)){
                    return true;
                }else  return false;
            }
        }
        return false;

    }

    static boolean ispalindrome (String str){
        int start =0;
        int end = str.length()-1;
        while (start<end){
            if (str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}
