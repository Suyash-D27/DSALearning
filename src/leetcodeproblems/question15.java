package leetcodeproblemsSuyash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class question15 {
    public static void main(String[] args) {
        int [] num ={0,0,0};

        System.out.println(threeSum(num));
    }
    static public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(nums.length==0||nums.length<3){
            return new ArrayList<>(){};
        }

        for (int i = 0; i <= nums.length-1; i++) {
            for (int j = 1; j < nums.length ; j++) {
                for (int k = 2; k < nums.length ; k++) {
                    if (nums[i]+nums[j]+nums[k]==0&&i!=j&&i!=k&&j!=k){
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);

                        Collections.sort(list);

                        res.add(list);

                    }

                }

            }


        }
        List<List<Integer>> fin =  res.stream().distinct().collect(Collectors.toList());
        return fin;
    }


}


