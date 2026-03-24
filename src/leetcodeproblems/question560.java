package leetcodeproblems;

public class question560 {

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int ans = subarraySum(arr,3);
        System.out.println(ans);

    }
    public static int subarraySum(int[] nums, int k) {
        int s=0;
        int e=0;
        int n =nums.length;
        int sum =0;
        int count =0;

        while(e<n){
            sum+=nums[e];

            if(sum==k){
                count++;
                s=e;
                sum = 0;
            }
            e++;
        }
        return count;

    }
}
