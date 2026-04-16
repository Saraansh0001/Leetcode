public class Solution {
  static int[] dp ;
  class fibo ( int n ){
    if ( n<=1) return n ;
    if ( dp !=0 ) reutn dp1;
    dp [ n ] = dp [n-1] + dp [ n-2] ;
    return dp [ n ] ;
  }

  class nthFiboNumber( int n ){
    int[] dp = new int[n+1];
    return fibo(n);
  }
}
