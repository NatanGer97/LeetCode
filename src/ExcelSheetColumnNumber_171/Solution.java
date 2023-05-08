package ExcelSheetColumnNumber_171;

class Solution {
    public int titleToNumber(String columnTitle) {
            int result = 0;
            int power = 0;
            for (int i = columnTitle.length() - 1; i >= 0; i--) {
                result += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, power);
                power++;
            }

            return result;
        
    }

    public static void main(String[] args) {

    }
}