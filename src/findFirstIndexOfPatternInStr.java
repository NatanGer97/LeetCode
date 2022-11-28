import java.util.*;

public class findFirstIndexOfPatternInStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        String  [] s = {"1","2","15","-7","300"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}