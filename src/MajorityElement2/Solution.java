package MajorityElement2;

import java.util.*;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> numToCount = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numToCount.containsKey(nums[i])) {
                int prevValue = numToCount.get(nums[i]);
                numToCount.put(nums[i],prevValue + 1);
            }
            else {
                numToCount.put(nums[i], 1);
            }
        }

        int maxCount = nums.length / 3;

        List<Integer> results = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : numToCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                results.add(entry.getKey());
            }
        }
        return results;
    }
}
