class Solution {
    public int climbStairs(int n) {
        if ( n==1 ) return 1;
        if ( n==2 ) return 2;
        return climbStairs(n-1) +  climbStairs(n-2) ;        
        // done using recursion, but it is too slow, we can use dynamic programming to optimize it
    }
}