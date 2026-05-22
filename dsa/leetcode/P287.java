package dsa.leetcode;

public class P287 {
    public static void main(String[] args) {
        // int[] nums = {1,3,4,2,2};
        int[] nums = {3,1,3,4,2};
        // int[] nums = {3,3,3,3,3};
        int duplicate = findDuplicate(nums);
        System.out.println(duplicate);
    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    int temp = nums[correct];
                    nums[correct] = nums[i];
                    nums[i] = temp;
                } else {
                    return nums[i];
                }
            } else {
                i++;
            } 
        }
        return -1;
    }
}