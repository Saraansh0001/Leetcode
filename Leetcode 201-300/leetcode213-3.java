class Solution {

    static int[] dp;

    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return loot (nums,0) ;
    }

    private int loot ( int arr[] , int n){
        if ( n >= arr.length ) return 0;
        if ( dp[n] != -1 ) return dp[n];

        int skip = loot(arr,n+1);
        int take = arr[n] + loot(arr,n+2);

        int ans = Math.max(take,skip);
        dp[n] = ans ;
        return ans ;
    }
}

gfg version