package bitwiseAndNumberSystem;

public class nthBit {
    public static void main(String[] args) {
        int n=4;
        int num=87;
        System.out.println(bitis(num,n));
    }

    private static boolean bitis(int num, int n) {
        return (num&(1<<(n-1))) !=0 ;
    }
}
