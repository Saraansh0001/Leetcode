class Solution {

  public void moveZeroes ( int[] nums ){

    int insertPosition = 0 ;

    for (int i = 0; i < nums.length; i++) {
      if ( nums[i] != 0 ){
        int temp = nums [ insertPosition ] ;
        nums [ insertPosition ] = nums [i] ;
        nums[ i ] = temp ;
        insertPosition++;
      }
    }      
  }
}
