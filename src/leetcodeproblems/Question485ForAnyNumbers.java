package leetcodeproblemsSuyash;

public class Question485ForAnyNumbers {
    public static void main(String[] args) {
        int[] arr ={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max_count =0;
        int set_count=0;
        int s=0;
        int e=0;
        while (e< nums.length){
            if(nums[s]==nums[e]){
                set_count++;
                e++;
            }else {
                max_count=Math.max(max_count,set_count);
                s=e;
                set_count=0;
            }
        }
        return Math.max(max_count,set_count);
    }
}
