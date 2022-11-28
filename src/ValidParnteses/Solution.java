package ValidParnteses;

import java.util.*;

public class Solution
{
    public static void main(String[] args) {
        String input = "([])";


        System.out.println(isValid(input));
    }

    private static boolean isValid(String parentheses)
    {
        Stack<Character> stack = new Stack<>();
        char[] chars = parentheses.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if (currentChar == '(' || currentChar == '{' || currentChar == '[')
            {
                stack.add(currentChar);
                continue;
            }
            else // closing parentheses
            {
                if (stack.isEmpty()) return false;
                char poppedP;
                switch (currentChar) {
                    case '}':
                        poppedP = stack.pop();
                        if (poppedP == '(' || poppedP == '[')
                            return false;
                        break;
                    case ']':
                        poppedP = stack.pop();
                        if (poppedP == '(' || poppedP == '{')
                            return false;
                        break;
                    case ')':
                        poppedP = stack.pop();
                        if (poppedP == '[' || poppedP == '{')
                            return false;
                        break;

                }

            }
        }
        return stack.isEmpty();
    }
}
