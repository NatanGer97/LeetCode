package The_K_Weakest_Rows_in_a_Matrix;

import java.util.*;
import java.util.stream.*;

class Solution {
    public static int[] kWeakestRows(int[][] mat, int k)
    {
        Map<Integer,Integer> rowIndexToStrengthMap = new HashMap<>();
        /*
         other approach find strength of each row is to search the last 1 in each row,
         this can be achieved by binary search;
         */
        for (int i = 0; i < mat.length; i++) {
//            int lastIndexOf1InRow = Arrays.binarySearch(mat[i], 1);
            rowIndexToStrengthMap.put(i, Arrays.stream(mat[i]).sum());
//            rowIndexToStrengthMap.put(i, lastIndexOf1InRow);

        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(rowIndexToStrengthMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        int [] results = new int[k];
        for (int i = 0; i < results.length; i++) {
            results[i] = list.get(i).getKey();
        }

        return results;

    }


    public static void main(String[] args)
    {
        int [][] mat = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        System.out.println(Arrays.toString(kWeakestRows(mat, 2)));

    }
}