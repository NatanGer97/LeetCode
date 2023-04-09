from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        insertIndexInNums1: int = (n + m) - 1;
        while n > 0 and m > 0:
            if nums2[n - 1] > nums1[m - 1]:
                nums1[insertIndexInNums1] = nums2[n - 1]
                n -= 1
            else:
                nums1[insertIndexInNums1] = nums1[m - 1]
                m -= 1
            insertIndexInNums1 -= 1

            # in case nums2 still have numbers
            while n > 0:
                nums1[insertIndexInNums1] = nums2[n - 1]
                n -= 1
                insertIndexInNums1 -= 1
        print(nums1)


if __name__ == '__main__':
    Solution.merge(Solution, [1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3)

