package bitwiseAndNumberSystem;

public class findUnique {
    public static void main(String[] args) {
        int[] arr ={1,3,2,3,6,2,1};
        System.out.println(uniqueis(arr));
    }

    static int uniqueis(int[] arr) {
        int ans=0;
        for (int n:arr) {
            ans^=n;
        }
        return ans;
    }


}
