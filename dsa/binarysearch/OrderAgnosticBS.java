package dsa.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        // int[] arr = {30, 25, 15, 10, -5};
        // int target = 10;

        int[] arr = {-2, 0, 3, 5, 8, 38, 40, 87, 90};
        int target = 40;
        
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
            else {
                if (target > arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }

        return -1;

    }
}
