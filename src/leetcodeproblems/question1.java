package leetcodeproblems;

import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {
        int [] nums = {3,2,4};
        int[] ans =twosum(nums,6);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twosum(int[]nums,int target){
        for (int i = 0; i <nums.length-1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]+nums[j]==target&&i!=j) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
