package dsa.binarysearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 7, 8, 10};
        // int[] nums = {10, 5, 1, -2, -8};
        int target = 10;

        System.out.println(search(nums, target));

    }

    static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        boolean isAsc = nums[start] < nums[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            } 

            if (isAsc) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            
        }
        return -1;
    }
}
