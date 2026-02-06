package dsa.leetcode;


// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class P1295 {
    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896, 2587};
        System.out.println(findNumbers(nums));    
        // System.out.println(digits(15687));    
        
    }
    static int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {

        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    // might not be very useful for negative numbers
    // static int digits(int num) {

    //     // if (num < 0) num = num * -1;
    
    //     int digits = String.valueOf(num).length();
    //     return digits;
    // }
    
    // digits method 2
    // static int digits(int num) {

    //     if (num < 0) num = num * -1;
    //     int digits = 0;

    //     if (num == 0) return 1;

    //     while (num > 0) {
    //         digits++;
    //         num /= 10;
    //     }

    //     return digits;
    // }

    // digits method 3
    static int digits(int num) {

        if (num < 0) num = num * -1;

        return (int)(Math.log10(num)) + 1;
    }

}
