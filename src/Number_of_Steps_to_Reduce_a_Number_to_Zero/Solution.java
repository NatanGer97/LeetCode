package Number_of_Steps_to_Reduce_a_Number_to_Zero;

public class Solution {
    public static int  numberOfSteps(int num) {
        int stepsCounter = 0;
        while (num > 0) {
            num = num  % 2 == 0 ? num / 2 : --num;
            stepsCounter++;
        }

        return stepsCounter;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }
}
