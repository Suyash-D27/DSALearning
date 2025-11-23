package leetcodeproblemsSuyash;

public class question169 {
    public static void main(String[] args) {
        int[] nums ={1,1,3,2,2,1};
        System.out.println(majority(nums));
    }
    public static int majority(int [] nums){
        int n = nums.length;
        int ans =0;
        int freq =0;
        for (int i = 0; i < n; i++) {
            if(freq==0){
                ans=nums[i];
            }
            if(ans==nums[i]){
                freq++;
            }else {
                freq--;
            }
        }
        return ans;
    }


}
