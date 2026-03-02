class Solution {
    public int[] searchRange(int[] nums, int target) {

        int low = 0 ;
        int high = nums.length - 1 ;

        int mid = ( low + high ) / 2 ;

        int minIndex = -1;
        int maxIndex = -1;

        while ( low <= high ){
            mid = (low + high) /2 ;
            if ( nums [mid] > target)
                high = mid -1 ;
            else if ( nums [mid] < target )
                low = mid + 1 ;
            else if ( nums [mid] == target){
                minIndex = mid ; 
                high = mid -1 ;                               
            }
        }

        low = 0 ;
        high = nums.length -1 ;

        while ( low <= high ){
            mid = (low + high) /2 ;
            if ( nums [mid] > target)
                high = mid -1 ;
            else if ( nums [mid] < target )
                low = mid + 1 ;
            else if ( nums [mid] == target){
                maxIndex = mid ; 
                low = mid + 1 ;                               
            }
        }

        return new int[]{ minIndex , maxIndex } ;     
    }
}