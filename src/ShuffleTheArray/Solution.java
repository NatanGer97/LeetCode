package ShuffleTheArray;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];

        int i =0;
        int j = n ;
        int pairIndex = 0;
        while (i < n) {
            arr[pairIndex] = nums[i];
            arr[pairIndex + 1] = nums[j];
            pairIndex+=2;

            i++; j++;
        }

        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] shuffle = solution.shuffle(nums, n);
        for (int i = 0; i < shuffle.length; i++) {
            System.out.println(shuffle[i]);
        }
    }
}