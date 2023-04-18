package problemsolving.leetcode.algorithm.dynamicProgramming.decodeWays;

public class DecodeWaysBruteForce {
    public int numDecodings(String s) {
        return numDecodings(s, 0);
    }

    private int numDecodings(String s, int i) {
        if (s.length() <= i) {
            return 1;
        }

        if (s.charAt(i) == '0') {
            return 0;
        }

        int chooseSingleDigit = 0;
        if (s.charAt(i) != 0) {
            chooseSingleDigit = numDecodings(s, i + 1);
        }

        int chooseTwoDigits = 0;
        if (i < s.length() - 1 && Integer.parseInt("" + s.charAt(i) + s.charAt(i + 1)) <= 26) {
            chooseTwoDigits= numDecodings(s, i + 2);
        }

        // System.out.println("For i " + i + " single " + chooseSingleDigit + ", two digits:  " + chooseTwoDigits);
        return chooseSingleDigit + chooseTwoDigits;
    }
}
