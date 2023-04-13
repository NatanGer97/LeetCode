package Reverse_String_344;

public class Solution {
    /*
     * Write a function that reverses a string. The input string is given as an array of characters s.
     * Input: s = ["h","e","l","l","o"]
     * Output: ["o","l","l","e","h"]
     */
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char tempChar = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tempChar;
        }

        System.out.println(s);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = {'h','e','l','l','o'};
        solution.reverseString(s);
    }
}
