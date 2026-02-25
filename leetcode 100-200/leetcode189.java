class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k = k % n;

        int a = 0;
        int b = n - k - 1;

        while (a < b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }

        a = n - k;
        b = n - 1;

        while (a < b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }

        a = 0;
        b = n - 1;

        while (a < b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
}
