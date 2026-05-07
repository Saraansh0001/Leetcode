class Solution {
    static int absSum;

    public int findTargetSumWays(int[] arr, int target) {
        int n = arr.length;

        absSum = 0;
        for (int ele : arr) {
            absSum += Math.abs(ele);
        }

        int[][] dp = new int[n][2 * absSum + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * absSum + 1; j++) {
                dp[i][j] = -1;
            }
        }

        return helper(0, 0, target, arr, dp);
    }

    public int helper(int i, int sum, int target, int[] arr, int[][] dp) {

        if (i == arr.length) {
            if (sum == target) return 1;
            return 0;
        }

        if (dp[i][sum + absSum] != -1) {
            return dp[i][sum + absSum];
        }

        int add = helper(i + 1, sum + arr[i], target, arr, dp);
        int subtract = helper(i + 1, sum - arr[i], target, arr, dp);

        return dp[i][sum + absSum] = add + subtract;
    }
}