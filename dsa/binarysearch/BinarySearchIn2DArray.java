package dsa.binarysearch;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int lowerBound = arr[0][0];
        int upperBound = arr[0][arr[0].length - 1];

        System.out.println(lowerBound);
        System.out.println(upperBound);
    }
}
