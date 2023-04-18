package problemsolving.leetcode.algorithm.dynamicProgramming.decodeWays;

import java.util.HashMap;
import java.util.Map;

public class DecodeWaysDynamicProgramming {
    public int numDecodings(String s) {
        Map<Integer, Integer> memo = new HashMap<>();
        return numDecodings(s, 0, memo);
    }

    private int numDecodings(String s, int i, Map<Integer, Integer> memo) {
        if (memo.containsKey(i)) {
            return memo.get(i);
        }

        if (s.length() <= i) {
            return 1;
        }

        if (s.charAt(i) == '0') {
            return 0;
        }

        int chooseSingleDigit = 0;
        if (s.charAt(i) != 0) {
            chooseSingleDigit = numDecodings(s, i + 1, memo);
        }

        int chooseTwoDigits = 0;
        if (i < s.length() - 1 && Integer.parseInt("" + s.charAt(i) + s.charAt(i + 1)) <= 26) {
            chooseTwoDigits= numDecodings(s, i + 2, memo);
        }

        // System.out.println("For i " + i + " single " + chooseSingleDigit + ", two digits:  " + chooseTwoDigits);
        memo.put(i, chooseSingleDigit + chooseTwoDigits);

        return memo.get(i);
    }
}
