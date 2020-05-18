package problemsolving.hackerrank.datastructures.maps.sparseArray;

import java.util.HashMap;
import java.util.Map;

public class SparseArray {
    static int[] matchingStrings(String[] strings, String[] queries) {

        Map<String, Integer> stringMap = new HashMap<>();

        for (String string: strings) {
            stringMap.merge(string, 1, Integer::sum);
        }

        int[] answer = new int[queries.length];
        int i = 0;
        for(String query: queries) {
            Integer count = stringMap.get(query);
            answer[i++] = count == null ? 0: count;
        }
        return answer;
    }
}
