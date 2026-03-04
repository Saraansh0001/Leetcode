class Solution {
    public int maximumCount(int[] nums) {

        int n = nums.length;

        int left = 0, right = n - 1;
        int firstPos = n;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] > 0) {
                firstPos = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        left = 0;
        right = n - 1;
        int firstZero = n;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] >= 0) {
                firstZero = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        int negCount = firstZero;
        int posCount = n - firstPos;

        return Math.max(negCount, posCount);
    }
}