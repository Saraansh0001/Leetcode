class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);

        int n = nums[nums.length - 1]; // largest element

        // size must be n + 1
        if (nums.length != n + 1)
            return false;

        // check 1 to n-1 appear exactly once
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != i + 1)
                return false;
        }

        // last two elements must be n
        return nums[n - 1] == n && nums[n] == n;
    }
}