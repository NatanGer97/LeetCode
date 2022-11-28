package PlusOne;

import java.util.*;

public class Solution {
    public static int[] plusOne(int[] digits) {
        int reaming = 1;
        int indexFromEnd = digits.length - 1;

        while (reaming != 0 && indexFromEnd >= 0)
        {
            int currentSum = digits[indexFromEnd] + 1;
            if (currentSum > 9) {
                digits[indexFromEnd] = currentSum % 10;
                reaming = currentSum / 10;
            } else {
                reaming = 0;
                digits[indexFromEnd] = currentSum;

            }

            indexFromEnd--;
        }

        if (reaming != 0) // case: 9 + 1 => 10
        {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = reaming;
            for (int i = 1; i<newDigits.length; i++)
            {
                newDigits[i] = digits[i-1];
            }
            return newDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(plusOne(new int[]{9})));
//        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9,9})));
    }
}
