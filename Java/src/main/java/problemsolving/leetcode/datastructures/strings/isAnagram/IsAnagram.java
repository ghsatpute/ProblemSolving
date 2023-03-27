package problemsolving.leetcode.datastructures.strings.isAnagram;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Long> string1map = new HashMap<>();
        Map<Character, Long> string2map = new HashMap<>();

        for (char ch: s.toCharArray()) {
            string1map.put(ch, 1L + string1map.getOrDefault(ch, 0L));
        }

        for (char ch: t.toCharArray()) {
            string2map.put(ch, 1L + string2map.getOrDefault(ch, 0L));
        }

        if (string1map.size() != string2map.size()) {
            return false;
        }

        for (char ch: string1map.keySet()) {
            // Comparing Longs with `==` doesn't work so use `.equals` instead
            if (!string1map.get(ch).equals(string2map.get(ch))) {
                return false;
            }
        }

        return true;
    }
}
