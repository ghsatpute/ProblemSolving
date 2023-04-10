package problemsolving.leetcode.datastructures.graphs.numberOfIslands;

import java.util.Stack;

public class NumberOfIslands {
    private static class GridLocation {
        int row;
        int col;
        public GridLocation(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int numIslands(char[][] grid) {
        int numIslands = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    bfs(grid, visited, i, j);
                    numIslands++;
                }
            }
        }

        return numIslands;
    }

    private void bfs(char[][] grid, boolean[][] visited, int currentRow, int currentCol) {
        Stack<GridLocation> stack = new Stack<>();
        stack.push(new GridLocation(currentRow, currentCol));

        while (!stack.isEmpty()) {
            GridLocation current = stack.pop();
            if (visited[current.row][current.col] || grid[current.row][current.col] == '0') {
                continue;
            }

            visited[current.row][current.col] = true;

            // Left cell
            if(current.row > 0) {
                stack.push(new GridLocation(current.row - 1, current.col));
            }

            // Right cell
            if (current.row < grid.length - 1) {
                stack.push(new GridLocation(current.row + 1, current.col));
            }

            // Top cell
            if (current.col > 0) {
                stack.push(new GridLocation(current.row, current.col - 1));
            }

            // Bottom cell
            if (current.col < grid[0].length - 1) {
                stack.push(new GridLocation(current.row, current.col + 1));
            }
        }
    }
}
