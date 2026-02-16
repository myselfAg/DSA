package dsa.binarysearch;

public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 17, 18};

        int target = -5;

        System.out.println(ceil(arr, target));

    }

    // smallest number >= target
    static int ceil(int[] arr, int ceilTarget) {

        int start = 0;
        int end = arr.length - 1;

        if (ceilTarget > arr[end]) return -1;
        // if (ceilTarget < arr[start]) return -1; // floor

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (ceilTarget == arr[mid]) {
                return arr[mid];
            }
            else if (ceilTarget < arr[mid]) {
                end = mid - 1;
            }
            else if (ceilTarget > arr[mid]) {
                start = mid + 1;
            }
        }

        // return arr[start];
        return arr[end]; // floor - greatest number <= target
    }
}
