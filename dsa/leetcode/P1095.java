package dsa.leetcode;


public class P1095 {

    // https://leetcode.com/problems/find-in-mountain-array/description/

    // to solve the problem in leetcode you just need to use arr.get(index) instead of arr[index] and arr.length() instead of arr.length
    
    public static void main(String[] args) {
        int[] mountainArr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(target, mountainArr));
    }
    static int findInMountainArray(int target, int[] mountainArr) {
        
        int maxVal = peakIndexInMountainArray(mountainArr);
        int ans = orderAgnosticBS(mountainArr, target, 0, maxVal);
        if (ans != -1) {
            return ans;
        }

        return orderAgnosticBS(mountainArr, target, maxVal + 1, mountainArr.length - 1);
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) end = mid - 1;
                else if (target > arr[mid]) start = mid + 1;
            }
            else {
                if (target > arr[mid]) end = mid - 1;
                else if (target < arr[mid]) start = mid + 1;
            }
        }

        return -1;
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }

        return start;
    } 
}

