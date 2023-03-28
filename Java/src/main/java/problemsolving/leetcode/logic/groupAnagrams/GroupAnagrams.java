package problemsolving.leetcode.logic.groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> output = new HashMap<>();
        for (String str : strs) {
            int[] counts = new int[26];
            for (char ch : str.toCharArray()) {
                int key = ch - 'a';
                counts[key] = counts[key] + 1;
            }

            String key = Arrays.stream(counts)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining("-"));

            List<String> list = output.getOrDefault(key, new ArrayList<>());
            list.add(str);
            output.put(key, list);
        }

        return new ArrayList<>(output.values());
    }
}
