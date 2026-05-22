package dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class P448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> missings = findDisappearedNumbers(nums);
        System.out.println(missings);
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
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

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j]) {
                ans.add(j + 1);
            }
        }
        return ans;
    }
}
