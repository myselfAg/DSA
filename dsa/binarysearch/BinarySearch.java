package dsa.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 3, 5, 8, 38, 40, 87, 90};
        // int[] arr = {87, 90};
        // int[] arr = {-2};
        int target = 38;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if (target < arr[mid]) end = mid - 1;
            // else if (target > arr[mid]) start = mid + 1;
            // else return mid;

            if (target == arr[mid]) {
                return mid;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }

}
