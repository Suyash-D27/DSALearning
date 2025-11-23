package leetcodeproblemsSuyash;

public class question136 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,2,1};
        System.out.println(single(nums));
    }
    public static int single (int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=res^i;
        }
        return res;

    }
}
