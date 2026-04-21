package dsa.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 1, 2, 7};
        int target = 1;
        int start = 1;
        int end = 4;
        int ans = search(arr, start, end, target);

        System.out.println("Element is found at index " + ans);

    }
    static int search(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            } 
        }
        return -1;
    }
}
