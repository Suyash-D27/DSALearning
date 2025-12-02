package leetcodeproblems;

public class Question128 {
    public static void main(String[] args) {
        int [] arr ={100,4,200,1,3,2};
        System.out.println(sol(arr));
    }

    public static int sol (int [] arr){
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < arr.length; i++) {
           if(arr[i]>n){
               continue;
           }
            ans[arr[i]]= arr[i];
        }
        int maxcount = 0;
        int count =0;
        for (int i = 0; i < ans.length ; i++) {
            if (ans[i]==0){
                maxcount=Math.max(maxcount,count);
                count=0;
            }
            if (ans[i]==i&&ans[i]!=0){
                count++;
            }
        }
        return maxcount;
    }
}
