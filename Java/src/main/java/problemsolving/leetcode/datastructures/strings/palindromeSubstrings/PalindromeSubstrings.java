package problemsolving.leetcode.datastructures.strings.palindromeSubstrings;

public class PalindromeSubstrings {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            // From current i'th position find odd length palindrome strings
            // by traversing in both directions.
            int j = 0;
            while(i - j >= 0 && i + j < s.length()) {
                if (s.charAt(i - j) == s.charAt(i + j)) {
                    count++;
                    j++;
                } else {
                    break;
                }
            }

            // From current i'th position find even length palindrom strings
            // by traversing in both directions
            j = 0;
            while (i - j >= 0 && i + 1 + j < s.length()) {
                if (s.charAt(i - j) == s.charAt(i + 1+ j)) {
                    count++;
                    j++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}
