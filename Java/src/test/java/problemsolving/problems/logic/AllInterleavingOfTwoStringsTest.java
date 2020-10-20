package problemsolving.problems.logic;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AllInterleavingOfTwoStringsTest {

    @Test
    public void testCase01_oneStringEmpty() {
        String string1 = "AB";
        String string2 = "";

        List<String> output = AllInterleavingOfTwoStrings.solve(string1, string2);

        List<String> expectedList = Collections.singletonList("AB");

        assertEquals(1, output.size());
        output.removeAll(expectedList);
        assertEquals(0, output.size());
    }

    @Test
    public void testCase02() {
        String string1 = "AB";
        String string2 = "CD";

        List<String> output = AllInterleavingOfTwoStrings.solve(string1, string2);

        List<String> expectedList = Arrays.asList("ABCD", "ACBD", "ACDB", "CABD", "CADB", "CDAB");

        assertEquals(6, output.size());
        output.removeAll(expectedList);
        assertEquals(0, output.size());
    }
}