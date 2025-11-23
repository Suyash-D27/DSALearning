package leetcodeproblemsSuyash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question46 {
    public static void main(String[] args) {
        int[] num ={0,-1,1};
        System.out.println(A(num));
    }

    public static List<List<Integer>> A (int[] nums) {
        StringBuilder sb= new StringBuilder();
        for(int num: nums){
            sb.append(num);
        }
        String up = sb.toString();
       return solution("" ,up);
    }

    public static List<List<Integer>> solution(String p,String up){
        List<List<Integer>> result = new ArrayList<>();

        if(up.isEmpty()){
            List<Integer> onechar = new ArrayList<>();
            for (char ch :p.toCharArray()){
                onechar.add(ch-'0');
            }
            result.add(onechar);
            return result;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <=p.length() ; i++) {
            String left = p.substring(0,i);
            String right = p.substring(i);
            String newProcessed = left + ch + right;
            String newUnprocessed = up.substring(1);


            result.addAll(solution(newProcessed,newUnprocessed));
        }

        return result;
    }


}
