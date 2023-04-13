package problemsolving.leetcode.datastructures.arrays.pacificAtlanticWaterFlow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PacificAtlanticWaterFlow {
    public static class Position {
        public int row;
        public int col;
        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public Position getLeftPosition() {
            if (col == 0) {
                return null;
            } else {
                return new Position(row, col - 1);
            }
        }

        public Position getRightPosition(int maxCols) {
            if (col >= maxCols - 1) {
                return null;
            } else {
                return new Position(row, col + 1);
            }
        }

        public Position getTopPosition() {
            if (row == 0) {
                return null;
            } else {
                return new Position(row - 1, col);
            }
        }

        public Position getBottomPosition(int maxRows) {
            if (row >= maxRows - 1) {
                return null;
            } else {
                return new Position(row + 1, col);
            }
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        List<List<Integer>> solution = new ArrayList<>();

        Stack<Position> pacificStack = new Stack<>();

        boolean[][] pacificVisited = new boolean[heights.length][heights[0].length];
        for (int i = 0; i < heights[0].length; i++) {
            pacificVisited[0][i] = true;
            pacificStack.push(new Position(0, i));
        }

        for (int i = 0; i < heights.length; i++) {
            pacificVisited[i][0] = true;
            pacificStack.push(new Position(i, 0));
        }
        visit(pacificStack, pacificVisited, heights);
        System.out.println(Arrays.deepToString(pacificVisited));

        Stack<Position> atlanticStack = new Stack<>();
        int maxRows = heights.length - 1;
        int maxCols = heights[0].length - 1;

        boolean[][] atlanticVisited = new boolean[heights.length][heights[0].length];
        for (int i = 0; i < heights[0].length; i++) {
            atlanticVisited[maxRows][i] = true;
            atlanticStack.push(new Position(maxRows, i));
        }

        for (int i = 0; i < heights.length; i++) {
            atlanticVisited[i][maxCols] = true;
            atlanticStack.push(new Position(i, maxCols));
        }
        visit(atlanticStack, atlanticVisited, heights);
        System.out.println(Arrays.deepToString(atlanticVisited));


        for (int row = 0; row < heights.length; row++) {
            for (int col = 0; col < heights[row].length; col++) {
                if (pacificVisited[row][col] && atlanticVisited[row][col]) {
                    solution.add(Arrays.asList(row, col));
                }
            }
        }

        return solution;
    }

    private void visit(Stack<Position> stack, boolean[][] visited, int[][] heights) {
        while(!stack.isEmpty()) {
            Position current = stack.pop();
            visited[current.row][current.col] = true;

            Position leftPosition = current.getLeftPosition();
            if (canVisitNewPosition(heights, visited, current, leftPosition)) {
                stack.push(leftPosition);
            }

            Position rightPosition = current.getRightPosition(visited[0].length);
            if (canVisitNewPosition(heights, visited, current, rightPosition)) {
                stack.push(rightPosition);
            }

            Position topPosition = current.getTopPosition();
            if (canVisitNewPosition(heights, visited, current, topPosition)) {
                stack.push(topPosition);
            }

            Position bottomPosition = current.getBottomPosition(visited.length);
            if (canVisitNewPosition(heights, visited, current, bottomPosition)) {
                stack.push(bottomPosition);
            }
        }
    }

    private boolean canVisitNewPosition(int[][] heights, boolean[][] visited, Position currentPos, Position newPos) {
        return newPos != null
                && !visited[newPos.row][newPos.col]
                && heights[currentPos.row][currentPos.col] <= heights[newPos.row][newPos.col];
    }
}
