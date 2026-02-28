class Solution {
    public int peakIndexInMountainArray(int[] nums) {

        int left = 1;                      // start from 1
        int right = nums.length - 2;       // end at n-2

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            } 
            else if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return -1;
    }
}