package ContainsDuplicate_217;

import java.util.*;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return !(set.size() == nums.length);
        /*HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int prevValue = map.get(nums[i]);
                map.put(nums[i],prevValue + 1 );
            }
            else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            if (item.getValue() < 2) return false;
        }

        return true;*/
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,1};
        System.out.println(solution.containsDuplicate(nums));
    }
}
