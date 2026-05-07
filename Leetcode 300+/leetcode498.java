class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int[] res = new int[m * n];
        int idx = 0;

        for (int d = 0; d < m + n - 1; d++) {

            if (d % 2 == 0) {
                // UP direction ↗️
                int i = (d < m) ? d : m - 1;
                int j = d - i;

                while (i >= 0 && j < n) {
                    res[idx++] = mat[i][j];
                    i--;
                    j++;
                }

            } else {
                // DOWN direction ↙️
                int j = (d < n) ? d : n - 1;
                int i = d - j;

                while (j >= 0 && i < m) {
                    res[idx++] = mat[i][j];
                    i++;
                    j--;
                }
            }
        }

        return res;
    }
}