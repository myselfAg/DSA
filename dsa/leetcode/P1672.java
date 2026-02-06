package dsa.leetcode;


// https://leetcode.com/problems/richest-customer-wealth/description/

public class P1672 {
    public static void main(String[] args) {
        int[][] accounts = {{-1,-2,-3},{-2,-1}};  
        
        System.out.println(maximumWealth(accounts));
        
    }

    static int maximumWealth(int[][] accounts) {
        int sum = 0, max = Integer.MIN_VALUE;

        for (int cust = 0; cust < accounts.length; cust++) {
            for (int acc = 0; acc < accounts[cust].length; acc++) {
                sum += accounts[cust][acc];
            }

            if (max < sum) max = sum; 
            
            sum = 0;
        }

        return max;
    }
}
