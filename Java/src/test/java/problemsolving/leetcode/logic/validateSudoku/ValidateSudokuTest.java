package problemsolving.leetcode.logic.validateSudoku;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateSudokuTest {
    @Test
    public void testCase01() {
        char[][] input = new char[][] {
                {'.','.','.','.','5','.','.','1','.'},
                {'.','4','.','3','.','.','.','.','.'},
                {'.','.','.','.','.','3','.','.','1'},
                {'8','.','.','.','.','.','.','2','.'},
                {'.','.','2','.','7','.','.','.','.'},
                {'.','1','5','.','.','.','.','.','.'},
                {'.','.','.','.','.','2','.','.','.'},
                {'.','2','.','9','.','.','.','.','.'},
                {'.','.','4','.','.','.','.','.','.'}
        };

        boolean result = new ValidateSudoku().isValidSudoku(input);
        assertFalse(result);
    }
}