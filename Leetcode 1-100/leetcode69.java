class Solution {
    public int mySqrt(int x) {

        int root = 0;
        for ( int i = 0 ; i <= x ; i++){
            if ( i* i > x ) break;
            root = i ;
        }
        return  root;
        
    }
}