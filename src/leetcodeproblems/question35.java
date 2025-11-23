package leetcodeproblemsSuyash;

public class question35 {
    public static void main(String[] args) {
        int [] nums ={1,3,5,7};
        System.out.println(solution(nums,6));
    }
    public static int solution(int [] nums,int target){

        int temp =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=target){
                temp=i;
                return temp;
            }

        }

        return nums.length;
    }
}
