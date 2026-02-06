package dsa.linearsearch;
public class MinMax {
    public static void main(String[] args) {
        int[] arr = {90, 38, 12, 18};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
