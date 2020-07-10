package problemsolving.leetcode.logic.longestPalindromicSubstring;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int maxLength = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            // For palindrome with odd num of chars, one element at center,
            for (int delta = 0; i - delta >= 0 && i + delta < s.length(); delta++) {
                if (s.charAt(i - delta) != s.charAt(i + delta)) {
                    break;
                }
                if (delta * 2 + 1 > maxLength) {
                    maxLength = delta * 2 + 1;
                    start = i - delta;
                    end = i + delta;
                }
            }

            for (int delta = 0; i - delta >= 0 && i + delta + 1 < s.length(); delta++) {
                if (s.charAt(i - delta) != s.charAt(i + delta + 1)) {
                    break;
                }
                if ((delta + 1) * 2 > maxLength) {
                    maxLength = (delta + 1) * 2;
                    start = i - delta;
                    end = i + delta + 1;
                }
            }
        }

        System.out.println(String.format("Max Length %s start %s end %s", maxLength, start, end));
        return s.substring(start, end + 1);
    }
}
