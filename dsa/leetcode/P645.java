package dsa.leetcode;

import java.util.Arrays;

public class P645 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j]) {
                return new int[] {nums[j], nums[j] + 1};
            }
        }
        return new int[] {-1, -1};
    }
}
