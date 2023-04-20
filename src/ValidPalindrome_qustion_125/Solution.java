package ValidPalindrome_qustion_125;

class Solution {
    /*
    * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
    * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.*/
    public boolean isPalindrome(String s) {
        // replace all non-alphanumeric characters with empty string
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        // convert all uppercase letters into lowercase letters
        s = s.toLowerCase();
        char[] sAsArray = s.toCharArray();
        for (int i =0, j = s.length() - i -1; i <=j; i++,j--) {
            if (sAsArray[i] != sAsArray[j]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
