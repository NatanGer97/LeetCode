package BinarySearch;

public class BasicSearch {

    public static int search(int[] nums, int target) {
        int left = 0; int right = nums.length - 1;
        while (left <= right)
        {
            int middle = (left + right) / 2;
            if(nums[middle] == target) return  middle;
            else if (nums[middle] < target) left = middle + 1;
            else right = middle - 1;
        }

        return  -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] {-1,0,3,5,9,12},9));
        System.out.println(search(new int[] {5},5));
    }
}
