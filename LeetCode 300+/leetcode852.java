class Solution {
    public int peakIndexInMountainArray(int[] nums) {

        int left = 0 ; 
        int right = nums.length - 1;
        int mid ;

        while ( left < right ){
            mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left ;
    }
}
