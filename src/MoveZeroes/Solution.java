package MoveZeroes;

import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {
        // corner case length == 2 or 1
        if (nums.length == 1 ) return;
        if (nums.length == 2) {
            if (nums[0] == 0 && nums[1] != 0) {
                nums[0] = nums[1];
                nums[1] = 0;
            }
            return;
        }
        // find first index of 0;
        int zeroIndex = 0;
        int numIndex = 0;
        while (zeroIndex != nums.length && nums[zeroIndex] != 0) zeroIndex++;

        numIndex = zeroIndex + 1;

        while (zeroIndex != nums.length && numIndex != nums.length) {
            if (nums[zeroIndex] == 0 & nums[numIndex] == 0) {
                numIndex++;
            } else if (nums[zeroIndex] == 0 && nums[numIndex] != 0) {
                nums[zeroIndex] = nums[numIndex];
                nums[numIndex] = 0;
                zeroIndex++;
                numIndex++;
            }

        }

        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 0, 3, 12};

        solution.moveZeroes(nums);
    }
}