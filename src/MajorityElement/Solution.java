package MajorityElement;

public class Solution {

    public int findMajority(int[] nums) {
        int candidate = -1, votes = 0;

        // finding candidate for majority
        for (int i = 0; i < nums.length; i++) {
            if (votes == 0) {
                votes = 1;
                candidate = nums[i];
            } else {
                if (nums[i] == candidate) {
                    votes++;
                }
                else votes--;
            }
        }

        votes = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate)
                votes++;
        }

        if (votes > (nums.length / 2))
            return candidate;
        else return -1;


    }
}
