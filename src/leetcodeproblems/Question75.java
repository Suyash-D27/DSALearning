package leetcodeproblems;

import java.util.Arrays;

public class Question75 {
    public static void main(String[] args) {
        int [] arr ={2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        int s = 0;
        int m=0;
        int e= nums.length-1;

        while (m<=e){
            if (nums[m]==0){
                swap(s,m,nums);
                s++;
                m++;
            }
            else if (nums[m]==1){
                m++;
            }else {
                swap(m,e,nums);
                e--;
            }
        }
    }

    public static void swap(int a, int b,int[] nums){
        int temp =nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

}
