package dsa.linearsearch;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 1, 2, 7};
        int max = searchMax(arr);
        int min = searchMin(arr);

        System.out.println("Max " + max);
        System.out.println("Min " + min);

    }
    static int searchMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } 
        }
        return max;
    }
    static int searchMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } 
        }
        return min;
    }
}
