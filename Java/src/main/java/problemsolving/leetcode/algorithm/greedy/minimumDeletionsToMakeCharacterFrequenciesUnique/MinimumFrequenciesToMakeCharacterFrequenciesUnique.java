package problemsolving.leetcode.algorithm.greedy.minimumDeletionsToMakeCharacterFrequenciesUnique;

import java.util.HashMap;
import java.util.Map;

public class MinimumFrequenciesToMakeCharacterFrequenciesUnique {
    public int minDeletions(String s) {
        int[] characterCounts = new int[26];
        for (char ch : s.toCharArray()) {
            characterCounts[ch - 'a']++;
        }

        Map<Integer, Boolean> countMap = new HashMap<>();

        int answer = 0;

        for (int count : characterCounts) {
            if (countMap.containsKey(count)) {
                int distance = checkNearestNeighbourDistance(countMap, count);
                answer += Math.abs(distance);
                countMap.put(count + distance, true);
            } else {
                countMap.put(count, true);
            }
        }

        return answer;
    }

    private int checkNearestNeighbourDistance(Map<Integer, Boolean> countMap, int current) {
        int distance = 0;
        int i = current;
        while (i > 0) {
            if (countMap.containsKey(i)) {
                distance--;
                i--;
            } else {
                return distance;
            }
        }
        return distance;
    }
}
