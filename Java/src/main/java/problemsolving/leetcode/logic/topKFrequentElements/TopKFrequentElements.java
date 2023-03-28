package problemsolving.leetcode.logic.topKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    // https://www.youtube.com/watch?v=YPTqKIgVk-k&ab_channel=NeetCode
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> bucketSort = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            bucketSort.add(new ArrayList<>());
        }

        Map<Integer, Integer> counts = new HashMap<>();
        for (int i: nums) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }

        for (int key: counts.keySet()) {
            List<Integer> list = bucketSort.get(counts.get(key) - 1);
            list.add(key);
        }

        int[] output = new int[k];
        int index = 0;

        for (int i = bucketSort.size() - 1; i >= 0 && index < k;) {
            List<Integer> bucket = bucketSort.get(i);
            for(int item: bucket) {
                if (index >= k) {
                    break;
                }
                output[index++] = item;
            }
            i--;
        }

        return output;
    }
}
