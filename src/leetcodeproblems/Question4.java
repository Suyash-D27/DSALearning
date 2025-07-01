package leetcodeproblems;

import java.sql.Array;
import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        int[] num1 ={1,3};
        int[] num2={2,4};

        System.out.println(solution(num1,num2));

    }

    static double solution (int[]nums1,int[]nums2){
        int[] merged = new int[nums2.length+nums1.length];
        System.arraycopy(nums1,0,merged,0,nums1.length);
        System.arraycopy(nums2,0,merged,nums1.length,nums2.length);

        Arrays.sort(merged);

        int mid=merged.length/2;
        if (merged.length%2==0) {
            return ((merged[mid - 1] + merged[mid]) / 2.0);
        } else
            return merged[mid];

    }
}
