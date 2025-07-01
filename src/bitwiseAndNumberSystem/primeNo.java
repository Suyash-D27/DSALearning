package bitwiseAndNumberSystem;

public class primeNo {
    public static void main(String[] args) {
        int n=40;
//        System.out.println(isprime(n));
        boolean[]prime = new boolean[n+1];
        printprime(n,prime);

    }

    private static boolean isprime(int n) {

        if(n<=1){
            return false;
        }
        int c=2;
        while (c * c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

    static void printprime(int n, boolean[] prime){
        for (int i = 2; i*i<=n; i++) {
            if (!prime[i]){
                for (int j = 0; j <=n ; j+=i) {
                    prime[j]=true;
                }
            }

        }

        for (int i = 0; i <=n; i++) {
            if (!prime[i]){
                System.out.print(i+" ");
            }
        }

    }
}
