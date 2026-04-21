package dsa.leetcode;

public class P1672 {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };
        System.out.println(maxWealth(accounts)  );

    }
    static int maxWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int wealth = 0;
        for (int customer = 0; customer < accounts.length; customer++) {
            for (int account = 0; account < accounts[customer].length; account++) {
                wealth = wealth + accounts[customer][account];
            }
            if (wealth > max) {
                max = wealth;
            }
            wealth = 0;
        }
        return max;
    }
}
