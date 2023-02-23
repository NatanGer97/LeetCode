package ExcelSheetColumnTitle;

public class Solution {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char c = (char) (columnNumber % 26 + 'A');
            sb.append(c);
            columnNumber /= 26;
        }
        return sb.reverse().toString();

     /*   StringBuilder sb = new StringBuilder();
        int divResults = columnNumber / 26;
        int modResults = columnNumber % 26;
       if (divResults == 0) {
            sb.append((char) (modResults + 64));
            return sb.toString();
        }

        sb.append((char) (divResults + 64));
        sb.append((char) (modResults + 64));

        return sb.toString();*/


    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
}
