package leetcodeproblems;

public class Question485 {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max_count = 0;
            int set_count = 0;
            int e = 0;

            while (e < nums.length) {
                if (nums[e] == 1) {
                    set_count++;
                } else {
                    max_count = Math.max(max_count, set_count);
                    set_count = 0;
                }
                e++;
            }

            return Math.max(max_count, set_count);
        }
    }
}
