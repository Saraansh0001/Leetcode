import java.util.*;

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0, j = 0;
        int answer1 = 0, answer2 = 0;
        
        while (i < nums1.length && j < nums2.length) {
            
            if (nums1[i] == nums2[j]) {
                int val = nums1[i];
                
                int count1 = 0;
                int count2 = 0;
                
                while (i < nums1.length && nums1[i] == val) {
                    count1++;
                    i++;
                }
                
                while (j < nums2.length && nums2[j] == val) {
                    count2++;
                    j++;
                }
                
                answer1 += count1;
                answer2 += count2;
                
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        return new int[]{answer1, answer2};
    }
}
