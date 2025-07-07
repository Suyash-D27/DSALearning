package leetcodeproblems;

public class question27 {
    public static void main(String[] args) {
    int [] nums= {0,1,2,2,3,0,4,2};
        System.out.println(solution(nums,2));
    }

    static int  solution(int [] nums,int val){
        if(nums.length==0){
            return 0;
        }
        int j=0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
