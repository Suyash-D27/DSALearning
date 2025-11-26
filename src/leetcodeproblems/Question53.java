package leetcodeproblems;

public class Question53 {
    public static void main(String[] args) {
        int[] arr ={5,4,-1,7,8};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        long max = Integer.MIN_VALUE;
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];
            max= Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return (int)max;
    }
}

