using recurssion 

class Solution {
    
    public int rob(int[] nums) {
        return solve(nums, 0);
    }

    public int solve(int[] nums, int i) {
        if (i >= nums.length) {
            return 0;
        }

        int rob = nums[i] + solve(nums, i + 2);

        int skip = solve(nums, i + 1);

        return Math.max(rob, skip);
    }
}

tle error as recursion is taking too much time for large input.