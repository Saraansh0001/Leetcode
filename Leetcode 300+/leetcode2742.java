class Solution {
    public int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        int INF = Integer.MAX_VALUE;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) dp[i] = INF;

        for (int i = 0; i < n; i++) {
            int[] next = new int[n + 1];
            for (int j = 0; j <= n; j++) next[j] = dp[j];
            for (int j = 0; j <= n; j++) {
                if (dp[j] == INF) continue;
                int k = Math.min(n, j + time[i] + 1);
                next[k] = Math.min(next[k], dp[j] + cost[i]);
            }
            dp = next;
        }
        return dp[n];
    }
}
