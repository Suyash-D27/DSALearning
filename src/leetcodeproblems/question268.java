package leetcodeproblemsSuyash;

import java.util.Arrays;

public class question268 {
    public static void main(String[] args) {
        int [] arr= {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int Numsum =0;
        int size = nums.length+1;
        for (int i = 0; i <nums.length; i++) {
            Numsum= Numsum+nums[i];
        }
        int ACTsum= ((size*(size-1))/2);

        int missingnum = ACTsum-Numsum;
        return missingnum;
    }
}
