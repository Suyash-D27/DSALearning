package leetcodeproblems;

public class question1438 {

    public static void main(String[] args) {
        int [] arr = {10,1,2,4,7,2};
        System.out.println(longestSubarray(arr,5));
    }

    public static int longestSubarray(int[] nums, int limit) {
            int s=0;
            int e=1;
            int count =0;

            while (s<nums.length){

                if (nums[s]<limit && s<nums.length){
                    count++;

                }else if(Math.abs(nums[s]-nums[e])<limit){
                    e++;
                    count ++;
                }else {
                    s=e;
                    e=s+1;
                }
            }

            return count;
    }
}
