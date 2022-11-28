package RemoveDuplicates;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int indexInArrToSwap = 0;
        for (int index = 0; index < nums.length; index++) {
            if (index < nums.length - 1  && nums[index] == nums[index + 1]) continue;
            else {
                nums[indexInArrToSwap++] = nums[index];
            }
        }
        return indexInArrToSwap;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
