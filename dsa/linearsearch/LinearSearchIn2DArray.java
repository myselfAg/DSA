package dsa.linearsearch;

import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 8, 10, 90},
            {1, 8, 20},
            {30, 76, 89}
        };
        int target = 200;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        
        return new int[]{-1, -1};
    }
}
