package IntersectionOfTwoArraysII;

import java.util.*;

public class Solution {
    private  void extracted(int[] nums1, Map<Integer, Integer> elementsCounter) {
        for (int i : nums1) {
            if (elementsCounter.containsKey(i)){
                Integer integer = elementsCounter.get(i) + 1;
                elementsCounter.put(i, integer);
            }
            else {
                elementsCounter.put(i, 1);
            }
        }
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> elementsCounter = new HashMap<>();
        extracted(nums1, elementsCounter);

        List<Integer> result = new ArrayList<>();

        for (int i : nums2) {
            if (elementsCounter.containsKey(i) && elementsCounter.get(i) > 0){
                result.add(i);
                Integer integer = elementsCounter.get(i) - 1;
                elementsCounter.put(i, integer);
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = (int) result.get(i);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(solution.intersect(nums1, nums2)));
    }
}