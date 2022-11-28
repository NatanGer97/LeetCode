package LongestCommonPrefixe;

import java.util.*;

public class Solution {
    public static String longestCommonPrefix(String[] strs)
    {
        // sort strings by there length
        Arrays.sort(strs);
        int smallestStringLength = Math.min(strs[0].length(),strs[strs.length - 1].length());
        int lastIndexOfCommonPrefix = 0;
        while (lastIndexOfCommonPrefix < smallestStringLength
        && strs[0].charAt(lastIndexOfCommonPrefix) == strs[strs.length - 1].charAt(lastIndexOfCommonPrefix))
        {
            lastIndexOfCommonPrefix++;
        }
        String prefix = strs[0].substring(0, lastIndexOfCommonPrefix);
        /* find if the common prefix of first str and last str in sored strs is also
        * common prefix in all other strings in strs*/
        for (int strIndex = 1; strIndex < strs.length - 2; strIndex++)
        {
            if (!strs[strIndex].contains(prefix)) return  "";
        }
        return prefix;

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }
}
