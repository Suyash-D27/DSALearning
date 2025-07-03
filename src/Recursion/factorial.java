package Recursion;

public class factorial {
    public static void main(String[] args) {
       int n=10203;
//        System.out.println(fac(6));
//        System.out.println(SumofDigits(n));
//        int ans=reversNum2(n);
//        System.out.println(ans);
        System.out.println(count(n));

    }

    static int fac(int n){
        if (n<=1){
            return 1;
        }
        return n*fac(n-1);
    }

    static int SumofDigits(int n){
        if (n==0) return 0;
        return (n%10+SumofDigits(n/10));
    }
    static int sum =0;
    static void reversNum(int n){
        if (n == 0) {
            return ;
        }
        int rem=n%10;
        sum = sum*10+rem;
        reversNum(n/10);
    }

    static int reversNum2(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);

    }

   static int helper(int n, int digits) {
        if(n%10==n) return n;

        int rem= n%10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }

    static int count(int n){
        return helper2(n,0);
    }

    static int helper2(int n, int c) {
        if (n==0){
            return c;
        }
        int rem= n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }



}
