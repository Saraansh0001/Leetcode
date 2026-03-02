class Solution {
    public int findPeakElement(int[] arr) {

        int n = arr.length;

        int minIndex = -1 ;

        if (n == 1) return 0;

        if (arr[0] > arr[1]){
            minIndex = 0;
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) 
                minIndex = i;
        }

        if (arr[n - 1] > arr[n-2]) 
            minIndex =  n - 1;

        return minIndex;
    }
}