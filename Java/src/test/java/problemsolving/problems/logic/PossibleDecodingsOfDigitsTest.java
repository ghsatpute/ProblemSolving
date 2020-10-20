package problemsolving.problems.logic;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PossibleDecodingsOfDigitsTest {

    @Test
    public void testCase01_emptyString_shouldReturnEmptyList() {
        String input = "";

        List<String> output = PossibleDecodingsOfDigits.solve(input.toCharArray());

        assertEquals(0, output.size());
    }

    @Test
    public void testCase02_singleDigitString_shouldReturnOneString() {
        String input = "3";

        List<String> output = PossibleDecodingsOfDigits.solve(input.toCharArray());

        assertEquals(1, output.size());
        assertEquals("C", output.get(0));
    }

    @Test
    public void testCase03() {
        String input = "121";

        List<String> output = PossibleDecodingsOfDigits.solve(input.toCharArray());

        assertEquals(3, output.size());

        assertEquals("ABA", output.get(0));
        assertEquals("AU", output.get(1));
        assertEquals("LA", output.get(2));
    }

    @Test
    public void testCase04() {
        String input = "1234";

        List<String> output = PossibleDecodingsOfDigits.solve(input.toCharArray());

        assertEquals(3, output.size());

        assertEquals("ABCD", output.get(0));
        assertEquals("AWD", output.get(1));
        assertEquals("LCD", output.get(2));
    }
}