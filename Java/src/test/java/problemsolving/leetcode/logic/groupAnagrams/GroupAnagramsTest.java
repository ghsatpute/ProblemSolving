package problemsolving.leetcode.logic.groupAnagrams;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class GroupAnagramsTest {
    @Test
    public void testCase01() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> output = new GroupAnagrams().groupAnagrams(input);

        assertEquals(3, output.size());
        assertEquals(1, output.get(0).size());
        assertEquals(3, output.get(1).size());
        assertEquals(2, output.get(2).size());
    }
}