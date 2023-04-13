package Missing_Number_268;

import java.util.*;

public class Solution {
    /*
     * Given an array nums containing n distinct numbers in the range [0, n],
     * return the only number in the range that is missing from the array.
     */
    public int missingNumber(int[] nums) {
        // calc sum of all numbers in array

        int size = nums.length;
        int currentSum = Arrays.stream(nums).sum();
        // n*(a1 +an)/2
        int expectedSum = (size * (1 + size) ) / 2;


        return  expectedSum - currentSum;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(solution.missingNumber(nums));
    }
}
