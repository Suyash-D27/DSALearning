package leetcodeproblems;

import java.util.Arrays;

public class BSearchFloorAndCelling {
    public static void main(String[] args) {
            int [] nums = {3, 4, 4, 7, 8, 10};
            int t = 4;
            System.out.println(Arrays.toString(soltuion(nums,t)));

    }

    public static int[] soltuion (int[] nums,int t){
        int [] ans = new int[2];
        boolean isone = false;
        ans[0]=search(nums,isone,t);
        if(ans[0]!=-1){
            isone = true;
        }
        ans[1]=search(nums,isone,t);
        return ans;
    }

    public static int search (int[] nums, boolean isone, int t){
        int n= nums.length;
        int s=0;
        int e=n-1;
        int res=-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(isone){
                if (nums[m]>= t){
                    res=nums[m];
                    e=m-1;
                }else{
                    s=m+1;
                }
            }else {
                if(nums[m]<=t){
                    res=nums[m];
                    s=m+1;
                }else {
                    e=m-1;
                }
            }
        }

        return res;
    }
}
