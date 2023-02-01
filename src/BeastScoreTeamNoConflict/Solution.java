package BeastScoreTeamNoConflict;

import java.util.*;

class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        final int n = ages.length;
        int[][] ageScorePair = new int[n][2];

        for (int i = 0; i < n; i++) {
            ageScorePair[i][0] = ages[i];
            ageScorePair[i][1] = scores[i];
        }

       Arrays.sort(ageScorePair, (a, b) -> {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return a[0] - b[0];
            });

        int[] dp = new int[n];

        for (int i =0; i<n;i++){
            // current player's score
            dp[i] = ageScorePair[i][1];
            for (int j = 0; j < i; j++) {
                if (ageScorePair[i][1] >= ageScorePair[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + ageScorePair[i][1]);
                }
            }
        }

        return Arrays.stream(dp).max().getAsInt();


    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] scores = {1,2,3,5};
        int[] ages = {8,9,10,1};
        System.out.println(solution.bestTeamScore(scores, ages));
    }

}