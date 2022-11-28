package MaximumWealth;

import java.util.*;

public class Solution {
    public static  int maximumWealth(int[][] accounts) {
        int max = Arrays.stream(accounts[0]).sum();

        for (int i = 1; i < accounts.length; i++) {
            int rowSum = Arrays.stream(accounts[i]).sum();
             max = Math.max(rowSum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int [][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
}
