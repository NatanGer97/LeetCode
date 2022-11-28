package Two_Sum;

import java.util.*;

public class Solution {
    public  static int[] twoSum(int[] nums, int target)
    {
       int [] results = new int[2];
       Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (map.containsKey(t))
            {
                int k = map.get(t);
                if (k != i)
                 results =  new int[] {i,k};
            }
        }
        return results;

    }

    public static void main(String[] args) {
        int [] nums = new int[] {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));

    }
}
