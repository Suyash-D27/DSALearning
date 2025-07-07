package leetcodeproblems;


import java.lang.reflect.Array;
import java.util.Arrays;


public class question26 {
    public static void main(String[] args) {
    int [] nums ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeduplicate(nums));
        System.out.println(Arrays.toString(nums));

    }

    static int removeduplicate(int [] nums){
    if (nums.length==0) {
        return -1;
    }
    int j=0;

        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=nums[j]){
               j++;
               nums[j]=nums[i];
            }
        }
        return j+1;
    }
}
