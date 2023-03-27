package problemsolving.leetcode.logic.containsDuplicate;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int currentNum : nums) {
            if (map.containsKey(currentNum)) {
                return true;
            }
            map.put(currentNum, true);
        }

        return false;
    }
}
