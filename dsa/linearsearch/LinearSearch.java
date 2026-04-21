package dsa.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 1, 2, 7};
        int target = 7;
        int ans = search(arr, target);

        System.out.println("Element is found at index " + ans);

    }
    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            } 
        }

        // for (int element : arr) {
        //     if (element == target) {
        //         return element;
        //     }
        // }
        return -1;
    }
}
