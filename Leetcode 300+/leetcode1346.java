class Solution {
    public boolean checkIfExist(int[] arr) {

        for ( int i = 0 ; i<arr.length ; i++){
            int target = arr[i];
            for( int j = 0 ; j<arr.length ; j++){
                if ( i!=j && arr[j]*2 == target ) return true ;
            }
        }

        return false;
        
    }
}