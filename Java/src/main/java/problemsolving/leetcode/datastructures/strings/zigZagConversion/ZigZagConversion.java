package problemsolving.leetcode.datastructures.strings.zigZagConversion;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (s == null || s.length() < 2 || numRows == 1) {
            return s;
        }
        int maxJump = (numRows - 1) * 2;
        int currentJump = maxJump;
        int rowJump = currentJump;

        StringBuilder output = new StringBuilder();

        for (int currentRow = 0; currentRow < numRows; currentRow++) {

            int current = currentRow;

            while (current < s.length() && currentJump > 0) {
                output.append(s.charAt(current));
                current += currentJump;
                if (currentRow == 0 || currentRow == numRows - 1) {
                    currentJump = rowJump;
                } else {
                    currentJump = maxJump - currentJump;
                }
            }

            if (currentRow == numRows - 2) {
                rowJump = maxJump;
            } else {
                rowJump -= 2;
            }
            currentJump = rowJump;
        }
        return output.toString();
    }
}
