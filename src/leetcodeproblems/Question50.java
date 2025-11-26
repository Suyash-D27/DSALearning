package leetcodeproblems;

import java.util.logging.Handler;

public class Question50 {
    public static void main(String[] args) {
        System.out.println(sol(2,10));
    }

    public static double sol (double x, long n){
        if (n < 0) {
            return 1.0 / power(x, -n);
        }
        return power(x, n);
    }

    public static double power (double x, long n) {
        if (n==1){
            return x;
        }
        if (n==0){
            return 1;
        }

        if(n%2==0){
            return power(x*x,n/2);
        }
        return x*power(x,n-1);

    }
    public static double myPow(double x, long n) {
        if (n>0){
            if (n==1){
                return x;
            }
            double ans = x*myPow(x,n-1);
            return ans;
        }
        else {
            if (n==0){
                return 1;
            }
            double ans = 1/x*myPow(x,n+1);
            return ans;
        }
    }
}
