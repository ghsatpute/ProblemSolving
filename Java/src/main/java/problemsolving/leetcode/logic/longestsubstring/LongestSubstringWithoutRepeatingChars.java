package problemsolving.leetcode.logic.longestsubstring;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;

        Set<Character> uniqueChars = new HashSet<>();
        // "pwwkew"

        while (j < s.length()) {
            if (!uniqueChars.contains(s.charAt(j))) {
                uniqueChars.add(s.charAt(j));
                j++;
                max = Math.max(max, uniqueChars.size());
            } else {
                uniqueChars.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }
}
