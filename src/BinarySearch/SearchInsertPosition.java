package BinarySearch;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0; int right = nums.length;

        while (left < right)
        {
            int middle = (left + right ) / 2;
            if (nums[middle] == target)
            {
                return middle;
            }
            else if (nums[middle] < target)
            {
                left = middle + 1;
            }
            else {
                right = middle;
            }
        }
        return left;

    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {1,3,5,6}, 7));
    }
}
