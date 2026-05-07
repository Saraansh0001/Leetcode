class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int [coins.length][amount+1];
        int ans = helper(0, amount, coins , dp);
        return (ans != Integer.MAX_VALUE) ? ans : -1;
    }

    public int helper(int i, int sum, int[] coins , int[][] dp) {
        if (i >= coins.length) {
            if (sum == 0) return 0;
            else return Integer.MAX_VALUE;
        }

        if ( dp[i][sum] != 0 ) return dp[i][sum] = dp[i][sum];

        int skip = helper(i + 1, sum, coins , dp);

        int pick = Integer.MAX_VALUE;
        if (sum >= coins[i]) {
            int take = helper(i, sum - coins[i], coins , dp);
            if (take != Integer.MAX_VALUE) {
                pick = take + 1;
            }
        }

        return dp[i][sum] = Math.min(skip, pick);
    }
}