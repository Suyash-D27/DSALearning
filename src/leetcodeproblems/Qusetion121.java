package leetcodeproblemsSuyash;

public class Qusetion121 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,2,1};
        System.out.println(maxProfit(nums));

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

}
