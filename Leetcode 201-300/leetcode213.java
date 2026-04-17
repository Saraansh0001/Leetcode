using recusion 

class Solution {

    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        int case1 = solve(nums, 0, n - 2);
        int case2 = solve(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    public int solve(int[] nums, int i, int end) {
        // Base case
        if (i > end) return 0;

        // Rob
        int rob = nums[i] + solve(nums, i + 2, end);

        // Skip
        int skip = solve(nums, i + 1, end);

        return Math.max(rob, skip);
    }
}