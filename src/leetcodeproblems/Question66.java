package leetcodeproblemsSuyash;

import java.util.ArrayList;
import java.util.Arrays;

public class Question66 {
    public static void main(String[] args) {
        int[] nums = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        System.out.println(Arrays.toString(solution2(nums)));
    }

    public static int [] solution(int[] digits) {

        long sum=0;

        for (int i = 0; i < digits.length ; i++) {
             sum += digits[i]*(Math.pow(10,(digits.length-i-1)));
        }

        long newSum = sum+1;
        int count=0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (!((int)(newSum)==0)){

            long temp = newSum%10;
            newSum=  newSum/10;
            ans.add((int)temp);
             count++;

        }
        int size = ans.size();
        int[] finalans = new int [size];

        for (int i = 0; i <ans.size() ; i++) {
            finalans[i]= ans.get( (int) (size-1-i));
        }

        return finalans;

    }


    public static int [] solution2(int [] digits){
        int n = digits.length;

        // Iterate from the last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, there's no carry-over
            if (digits[i] < 9) {
                digits[i]++; // Increment the digit
                return digits; // And we're done!
            }

            // If the digit is 9, it becomes 0, and we continue the loop (carry-over)
            digits[i] = 0;
        }

        // If the loop completes, it means all digits were 9s (e.g., [9, 9, 9])
        // We need a new array with one more digit
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // Set the first digit to 1

        return newNumber;
    }


}
