class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int c1=0 , c2=0;
        int v1=0 , v2=0;

        for ( int num : nums ){
            
            if ( v1 == num ){
                c1++;
            }else if ( v2 == num){
                c2++;
            }
            else if ( c1==0 ){
                v1 = num ;
                c1=1;
            } else if ( c2==0 ){
                v2 = num ;
                c2=1;
            } else {
                c1-- ;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;
        
        for (int num : nums) {
            if (num == v1) c1++;
            else if (num == v2) c2++;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        if (c1 > nums.length / 3) result.add(v1);
        if (c2 > nums.length / 3) result.add(v2);
        
        return result;

    }
}
