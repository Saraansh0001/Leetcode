class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        // impossible case
        if ((long)m * k > bloomDay.length)
            return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int d : bloomDay) {
            low = Math.min(low, d);
            high = Math.max(high, d);
        }

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1; // try earlier day
            } else {
                low = mid + 1;  // need more days
            }
        }

        return ans;
    }

    private boolean canMake(int[] bloomDay, int m, int k, int day) {

        int count = 0;
        int bouquets = 0;

        for (int d : bloomDay) {

            if (d <= day) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return bouquets >= m;
    }
}