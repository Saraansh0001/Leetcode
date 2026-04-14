class Solution {
    public int uniquePaths(int m, int n) {
        if ( n==1 || m==1) return 1;
        return uniquePaths(m,n-1) + uniquePaths(m-1,n) ;
    }
}
// test cases run , but due to tle it is not accepted.