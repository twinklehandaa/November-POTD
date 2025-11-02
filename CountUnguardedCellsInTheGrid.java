class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];

        // 1 = guard, 2 = wall
        for (int[] guard : guards) grid[guard[0]][guard[1]] = 1;
        for (int[] wall : walls) grid[wall[0]][wall[1]] = 2;

        // Mark horizontally
        for (int i = 0; i < m; i++) {
            boolean seen = false;
            // Left → Right
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) seen = true;
                else if (grid[i][j] == 2) seen = false;
                else if (seen) grid[i][j] = 3;
            }
            // Right → Left
            seen = false;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 1) seen = true;
                else if (grid[i][j] == 2) seen = false;
                else if (seen) grid[i][j] = 3;
            }
        }

        // Mark vertically
        for (int j = 0; j < n; j++) {
            boolean seen = false;
            // Top → Bottom
            for (int i = 0; i < m; i++) {
                if (grid[i][j] == 1) seen = true;
                else if (grid[i][j] == 2) seen = false;
                else if (seen) grid[i][j] = 3;
            }
            // Bottom → Top
            seen = false;
            for (int i = m - 1; i >= 0; i--) {
                if (grid[i][j] == 1) seen = true;
                else if (grid[i][j] == 2) seen = false;
                else if (seen) grid[i][j] = 3;
            }
        }

        // Count unguarded cells
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) count++;
            }
        }

        return count;
    }
}

// Input: m = 4, n = 6, guards = [[0,0],[1,1],[2,3]], walls = [[0,1],[2,2],[1,4]]
// Output: 7
// Explanation: The guarded and unguarded cells are shown in red and green respectively in the above diagram.
// There are a total of 7 unguarded cells, so we return 7.
