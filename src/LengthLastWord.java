import java.util.*;

/***
 *
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal
 * substring
 *  consisting of non-space characters only.
 *
 */

public class LengthLastWord {
    public static  int lengthOfLastWord(String s) {
        String [] splitS = s.split(" ");
        return splitS[splitS.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World!"));
    }
}
