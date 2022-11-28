package ValidParnteses;

import javax.swing.event.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class program {

    public  static int verify(String text)
    {
        char[] chars = text.toCharArray();
        Stack<Character> parenthesesStack = new Stack<>();
        for (char aChar : chars) {
            if (aChar == '<' || aChar == '(' || aChar == '[') {
                parenthesesStack.add(aChar);

            } else if (aChar == '>' || aChar == ')' || aChar == ']') {
                if (parenthesesStack.isEmpty()) return 0;
                else if(aChar == ')' && parenthesesStack.pop() != '(') return 0;
                else if(parenthesesStack.pop() != '(') return 0;
                else if(parenthesesStack.pop() != '(') return 0;
            /*    switch (aChar) {
                    case ')':
                        if (parenthesesStack.pop() != '(') return 0;
                        break;
                    case ']':
                        if (parenthesesStack.pop() != '[') return 0;
                        break;
                    case '>':
                        if (parenthesesStack.pop() != '<') return 0;
                        break;
                }*/
            }
        }

        return  parenthesesStack.isEmpty() ? 1 : 0;
    }

    public static  int verifyMap(String text) {
       Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('<', '>');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (map.keySet().contains(currentChar)) stack.push(currentChar);
            else
            {
                if (map.values().contains(currentChar))
                {
                    if (!stack.empty())
                        if (map.get(stack.peek()) == currentChar)
                        stack.pop();
                        else return 0;
                    else  return 0;
                }
            }
        }
        return  stack.isEmpty() ? 1 : 0;



    }

    public static int func(String s, String a, String b)
    {
        boolean bo = Pattern.matches("^$",s);
        if (bo) return -1;
        else {
            int  i = s.length()-1;
            int aIndex = -1;
            int bIndex = -1;
            while ((aIndex == -1) && (bIndex == -1) && (i>=0))
            {

                if (s.substring(i,i+1).equals(a)) aIndex=i;
                if (s.substring(i,i+1).equals(b)) bIndex=i;
                i--;
            }
            if (aIndex != -1)
            {
                if(bIndex == -1) return  aIndex;
                else return Math.max(aIndex,bIndex);
            }
            else {
                if (bIndex != -1) return bIndex;
                else return -1;
            }
        }
    }
    public static int funcS(String s, String a, String b)
    {

//        if (s.isEmpty()) return -1;

          for (int i = s.length() - 1; i >=0; i--) {
            if (s.substring(i,i+1).equals(a) || s.substring(i,i+1).equals(b))
                return  i;
        }
        return -1;

        }



    public static void main(String[] args) {
        /*System.out.println(func("ab","a","a"));
        System.out.println(funcS("","a","a"));*/
        System.out.println(verifyMap("---(++++)---"));
        System.out.println(verifyMap("" ));
        System.out.println(verifyMap("before ( middle []) after "));
        System.out.println(verifyMap(") ( "));
        System.out.println(verifyMap("<( >) "));
        System.out.println(verifyMap("( [ <> () ] <> ) "));
        System.out.println(verifyMap("(    [) "));
        System.out.println(verifyMap("]"));

    }
}
