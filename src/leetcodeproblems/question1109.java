package leetcodeproblems;

import java.util.Arrays;

public class question1109 {

    public static void main(String[] args) {
        int[][] Booking = {{1,2,10},{2,3,20},{2,5,25}};
        int n = 5;

        System.out.println(Arrays.toString(corpFlightBookings(Booking,n)));
    }

    public static int[]  corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];

        for(int[] B : bookings){
            int first = B[0];
            int last = B[1];
            int seat = B[2];

            ans[first -1] += seat;
            while (first<last){
                ans[first]+=seat;
                first++;
            }
        }
        return ans;
    }
}
