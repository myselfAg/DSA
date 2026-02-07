package dsa.linearsearch;

public class MinMaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 8, 10, 90},
            {1, 8, 20},
            {30, 76, 89}
        };
        
        System.out.println(max(arr));
    }

    static int max(int[][] arr){

        int max = Integer.MIN_VALUE;
        
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        
        return max;
    }
}
