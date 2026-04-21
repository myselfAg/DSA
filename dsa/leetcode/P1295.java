package dsa.leetcode;

public class P1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isEven(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean isEven(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }
    
    // static void search(int[] nums) {
    //     int countDigits = 0;
    //     int count = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         while (nums[i] > 0) {
    //             count++;
    //             nums[i] = nums[i] / 10;
    //         }
    //         if (count % 2 == 0) {
    //             countDigits++;
    //         }
    //     }
    //     System.out.println(countDigits);
    // }
}
