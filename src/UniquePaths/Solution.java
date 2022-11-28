package UniquePaths;

import java.util.*;

public class Solution {
    public static int uniquePaths(int m, int n) {

        int[][]dp = new int[m][n];
        dp[0][0] = 0;
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i],1);
        }
        for (int rowIndex = 1; rowIndex < m; rowIndex++)
        {
            for (int colIndex = 1; colIndex < n; colIndex++)
            {
                dp[rowIndex][colIndex] = dp[rowIndex-1][colIndex] + dp[rowIndex][colIndex - 1];
            }
        }


        return  dp[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
    }
}