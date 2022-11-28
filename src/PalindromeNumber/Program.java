package PalindromeNumber;

public class Program {
    public static boolean isPalindrome(int x) {
        /*char[] s = String.valueOf(x).toCharArray();
        for (int i = 0; i<s.length / 2; i++)
        {
            if (s[i] != s[s.length - 1 - i]) return false;
        }

        return true;*/

        if (x < 0) return false;

        int reversedNumber = 0;
        int testingNum = x;
        while (x > 0) {
            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + x % 10;
            x = x / 10;
        }
        System.out.println(reversedNumber);
        return testingNum == reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
