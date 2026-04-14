class Solution {
    public int uniquePaths(int m, int n) {
        return paths(0,0,m-1,n-1);
    }
    public int paths(int rc , int cc , int lr , int lc){
        if ( rc == lr && cc == lc) return 1;
        if ( rc > lr || cc > lc) return 0 ;
        int right = paths(rc , cc+1 , lr , lc);
        int down = paths(rc+1 , cc , lr , lc );
        return right + down ;
    }
}