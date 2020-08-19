package problemsolving.leetcode.logic.validateSudoku;

public class ValidateSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch == '.') {
                    continue;
                }

                if (countInRow(board, i, j, ch) > 1) {
                    return false;
                }

                if (countInColumn(board, i, j, ch) > 1) {
                    return false;
                }

                if (countInSubBox(board, i, j, ch) > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private int countInRow(char[][] board, int row, int col, char ch) {
        int count = 0;
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch) {
                count++;
            }
        }
        // System.out.println("Count in row " + row + " col " + col + " for " + ch + " is " + count);
        return count;
    }

    private int countInColumn(char[][] board, int row, int col, char ch) {
        int count = 0;
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch) {
                count++;
            }
        }
        // System.out.println("Count in col " + row + " col " + col + " for " + ch + " is " + count);
        return count;
    }

    private int countInSubBox(char[][] board, int row, int col, char ch) {
        int boxRowStart = 0;
        int boxRowEnd = 0;
        int boxColStart = 0;
        int boxColEnd = 0;

        if (row < 3) {
            boxRowStart = 0;
            boxRowEnd = 2;
        } else if (row < 6) {
            boxRowStart = 3;
            boxRowEnd = 5;
        } else {
            boxRowStart = 6;
            boxRowEnd = 8;
        }

        if (col < 3) {
            boxColStart = 0;
            boxColEnd = 2;
        } else if (col < 6) {
            boxColStart = 3;
            boxColEnd = 5;
        } else {
            boxColStart = 6;
            boxColEnd = 8;
        }

        int count = 0;
        for (int i = boxRowStart; i <= boxRowEnd; i++) {
            for (int j = boxColStart; j <= boxColEnd; j++) {
                if (board[i][j] == ch) {
                    count++;
                }
            }
        }
        // System.out.println("boxRowStart " + boxRowStart + " boxRowEnd " + boxRowEnd +
        //                   "boxColStart " + boxColStart + " boxColEnd " + boxColEnd);
        // System.out.println("Count in row " + row + " col " + col + " for " + ch + " is " + count);
        return count;
    }
}
