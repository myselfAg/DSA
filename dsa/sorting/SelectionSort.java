package dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3, 5, 8, 7};
        // int[] arr = {4};
        // int[] arr = {};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {

            int maxIdx = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[maxIdx] < arr[j]) {
                    maxIdx = j;
                }
                // if (arr[j] < arr[minIdx]) {
                //     minIdx = j;
                // }
            }

            temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
    }
}
