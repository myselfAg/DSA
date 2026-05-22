package dsa.sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        // int[] arr = { 3, 5, 2, 1, 4, 7, 6 };
        // int[] arr = { 3, 3, 5, 2, 1, 4, 7, 6 };
        int[] arr = { 4, 5, 1, 2, 3 };
        // int[] arr = { 4, 0, 1, 2, 3 };
        // int[] arr = {1, 0, -2, -1, -3};
        cycleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }

    }

}
