package dsa.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {80, 63, 6, 35, -1, 12, 20};
        int target = 20;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
     
    // return the index
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1; 
    }

    // return the element
    // static int linearSearch(int[] arr, int target){
    //     if (arr.length == 0) {
    //         return -1;
    //     }
        
    //     for (int element : arr ) {
    //         if (element == target) {
    //             return element;
    //         }
    //     }

    //     return -1; 
    // }
}