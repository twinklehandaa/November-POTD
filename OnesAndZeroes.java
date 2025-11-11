class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] ans = new int[m+1][n+1];
        for (String str : strs){
            int zeroes = 0;
            int ones = 0;

            for (char c : str.toCharArray()){
                if (c=='0') zeroes++;
                else ones++;
            }

            // knapsack
            for (int i = m; i >=zeroes; i--){
                for (int j = n; j >= ones; j--){
                    ans[i][j] = Math.max(ans[i][j], ans[i-zeroes][j-ones] + 1);
                }
            }
        }
        return ans[m][n]; //last one in the grid is the solution
    }
}

// Input: strs = ["10","0001","111001","1","0"], m = 5, n = 3
// Output: 4
// Explanation: The largest subset with at most 5 0's and 3 1's is {"10", "0001", "1", "0"}, so the answer is 4.
// Other valid but smaller subsets include {"0001", "1"} and {"10", "1", "0"}.
// {"111001"} is an invalid subset because it contains 4 1's, greater than the maximum of 3.
