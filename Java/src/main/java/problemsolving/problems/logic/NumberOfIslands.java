package problemsolving.problems.logic;

public class NumberOfIslands {
    // https://www.geeksforgeeks.org/find-number-of-islands/
    public static int solve(int[][] mat) {
        int numOfMatrices = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    numOfMatrices++;
                    visitIsland(mat, i, j, numOfMatrices + 1);
                }
            }
        }
        return numOfMatrices;
    }

    private static void visitIsland(int[][] mat, int x, int y, int islandNum) {
        if (x < 0 || y < 0 || x >= mat.length || y >= mat.length) {
            return;
        }
        if (mat[x][y] != 1) return;

        mat[x][y] = islandNum;
        visitIsland(mat, x + 1, y, islandNum); // Visit right neighbour
        visitIsland(mat, x + 1, y - 1, islandNum);  // visit top right neighbour
        visitIsland(mat, x + 1, y + 1, islandNum);  // visit bottom right neighbour

        visitIsland(mat, x - 1, y, islandNum);  // visit top neighbour
        visitIsland(mat, x + 1, y, islandNum);  // visit bottom neighbour

        visitIsland(mat, x - 1, y, islandNum); // Visit left neighbour
        visitIsland(mat, x - 1, y - 1, islandNum);  // visit top left neighbour
        visitIsland(mat, x - 1, y + 1, islandNum);  // visit bottom left neighbour
    }
}
