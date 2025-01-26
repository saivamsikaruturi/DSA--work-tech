package org.dsa.graphs.dfs;

public class NumberOfIslands {
    public static void main(String[] args) {
        // Example grid input
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        // Instantiate the class and call the method
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        int result = numberOfIslands.numIslands(grid);

        // Print the number of islands
        System.out.println("Number of islands: " + result);
    }

    public int numIslands(char[][] grid) {
        int islands = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != '0') {
                    islands++;
                    dfs(grid, i, j, n, m);
                }
            }
        }
        return islands;
    }

    void dfs(char[][] grid, int i, int j, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j, n, m);
        dfs(grid, i + 1, j, n, m);
        dfs(grid, i, j - 1, n, m);
        dfs(grid, i, j + 1, n, m);
    }
}
