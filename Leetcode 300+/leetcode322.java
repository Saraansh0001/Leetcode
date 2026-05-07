class Solution {
    public int coinChange(int[] coins, int amount) {
        int ans = helper(0, amount, coins);
        return (ans != Integer.MAX_VALUE) ? ans : -1;
    }

    public int helper(int i, int sum, int[] coins) {
        // base case
        if (i >= coins.length) {
            if (sum == 0) return 0;
            else return Integer.MAX_VALUE;
        }

        // skip current coin
        int skip = helper(i + 1, sum, coins);

        // take current coin (FIX: stay at same index)
        int pick = Integer.MAX_VALUE;
        if (sum >= coins[i]) {
            int take = helper(i, sum - coins[i], coins); // ONLY CHANGE
            if (take != Integer.MAX_VALUE) {
                pick = take + 1;
            }
        }

        return Math.min(skip, pick);
    }
}

// tle