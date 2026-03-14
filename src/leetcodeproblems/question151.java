package leetcodeproblems;

public class question151 {

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords2(s));
    }


    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder ();
        int i = s.length()-1;
        int e = s.length()-1;
        while(i>=0){
            if(s.charAt(i)==' '){
                String word = s.substring(i+1,e+1);
                res.append(" "+word);
                e=i;
            }
            if(i==0){
                String word = s.substring(i,e+1);
                res.append(word);
                e=i;
            }

            i--;
        }

        return res.toString();
    }

    public static String reverseWords2(String s) {
        StringBuilder result = new StringBuilder();


        int i = s.length() - 1;


        while (i >= 0) {

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }


            if (i < 0) break;


            int end = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }


            String word = s.substring(i + 1, end + 1);


            if (result.length() > 0) {
                result.append(" ");
            }


            result.append(word);
        }

        return result.toString();
    }
}
