package dsa.leetcode;


// https://leetcode.com/problems/sort-colors/description/

// Note: This problem is done using insertion sort. After learning merge, quick, cycle sort try it again

import java.util.Arrays;

public class P75 {
    public static void main(String[] args) {
        int[] nums = { 5, 3, 4, 1, 2 };
        // int[] nums = {5};
        // int[] nums = {};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            while (j > 0) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                } else {
                    break;
                }
                j--;
            }
        }
    }
}
