import javax.management.*;
import java.util.*;

public class Roman_To_Int {
    public static void main(String[] args)
    {
//        String romanNum = "III";
        String romanNum = "MCMXCIV";
        //  'I' : 1, 'V' : 5, 'X' : 10, 'L' : 50, 'C' : 100, 'D' : 500, 'M' : 1000
        Map<String,Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put("I",1);
        romanToIntMap.put("V",5);
        romanToIntMap.put("X",10);
        romanToIntMap.put("L",50);
        romanToIntMap.put("C",100);
        romanToIntMap.put("D",500);
        romanToIntMap.put("M",1000);

        Map<String,List<String>> subCases = new HashMap<>();
        /*
          'I' : ['V','X'],
          'X' : ['L','C'],
           'C' : ['D', 'M']
        * */
        subCases.put("I",Arrays.asList("V","X"));
        subCases.put("X",Arrays.asList("L","C"));
        subCases.put("C",Arrays.asList("D","M"));
        int sum = 0;
//        int  i = 0;
        int ans = 0, num = 0;
        for (int i = romanNum.length()-1; i >= 0; i--) {
            switch(romanNum.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        System.out.println(ans);

     /*   while (i < romanNum.length())
        {
            char currentChar = romanNum.charAt(i);
            if (subCases.containsKey(String.valueOf(currentChar)))
            {
                List<String> list = subCases.get(String.valueOf(currentChar));
                if (i + 1 < romanNum.length() && list.contains(String.valueOf(romanNum.charAt(i + 1))) )
                {
                    sum += romanToIntMap.get(String.valueOf(currentChar)) * (-1) +
                            romanToIntMap.get(String.valueOf(romanNum.charAt(i + 1)));
                    i += 2;
                }
                else {
                    sum += romanToIntMap.get(String.valueOf(currentChar));
                    i++;
                }
             }
            else {
                sum += romanToIntMap.get(String.valueOf(currentChar));
                i++;
            }

        }*/
        System.out.println(sum);

    }

}
