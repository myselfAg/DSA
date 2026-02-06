package dsa.leetcode;


// https://leetcode.com/problems/missing-number/ 
// Amazon question

public class P268 {
    public static void main(String[] args) {
        // int[] arr = {3, 0, 1};
        int[] nums = {0, 1};
        int missingNumber = missingNumber(nums);
        System.out.println(missingNumber);
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[correct] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]) {
                return j;
            }
        }
        return nums.length;
    }
}
