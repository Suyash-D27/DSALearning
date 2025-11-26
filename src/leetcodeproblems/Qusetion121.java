package leetcodeproblemsSuyash;

public class Qusetion121 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,2,1};
        System.out.println(sol(nums));

    }
        public static int maxProfit(int[] prices) {
            int maxprofit=0;
            int mini = Integer.MAX_VALUE;
            for(int i =0;i<prices.length;i++){
                int cost=prices[i];
                mini = Math.min(cost,mini);
                int profit=prices[i]-mini;
                maxprofit = Math.max(profit,maxprofit);
            }
            return maxprofit;
        }

        public static int sol(int [] nums){

        int Maxprofit = 0;
        int currentpro = Integer.MIN_VALUE;
        int n= nums.length;
        if(n<2) return 0;
        int s= 0;
        int e=1;

        while (e<n){

            currentpro = nums[e]-nums[s];

            if(nums[e]<nums[s]){
                s=e;
            }
                Maxprofit = Math.max(Maxprofit, currentpro);

            e++;
        }
        return Maxprofit;
        }

}
