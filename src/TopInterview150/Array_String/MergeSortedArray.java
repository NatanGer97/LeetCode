package TopInterview150.Array_String;

import java.util.*;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int lastNum1 = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums2[n - 1] > nums1[m - 1]) {
                nums1[lastNum1] = nums2[n - 1];
                n--;

            } else {
                nums1[lastNum1] = nums1[m - 1];
                m--;
            }
            lastNum1--;
        }

        while (n > 0) {
            nums1[lastNum1] = nums2[n - 1];
            n--;
            lastNum1--;
        }
    }


    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1};
        int[] nums2 = {0};

        mergeSortedArray.merge(nums1, 0, nums2, 1);

        for (int i : nums1) {
            System.out.print(i + " ");
        }


    }

}
