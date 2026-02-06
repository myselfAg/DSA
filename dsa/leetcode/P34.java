package dsa.leetcode;


// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class P34 {
    public static void main(String[] args) {
        
        // int[] nums = {5,7,7,8,8,10};
        // int target = 8;

        int[] nums = {5,7,7,8,8,10};
        int target = 6;

        int[] ans = searchRange(nums, target);

        for (int pos : ans) {
            System.out.print(pos + " ");
        }
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // int start = search(nums, target, true);
        // int end = search(nums, target, false);

        // ans[0] = start;
        // ans[1] = end;

        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        
        return ans;
    }

    static int search(int[] nums, int target, boolean isFindingStart) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end  - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                ans = mid;
                if (isFindingStart) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
