package problemsolving.leetcode.datastructures.strings.zigZagConversion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZigZagConversionTest {
    @Test
    public void testCase01() {
        String input = "ABCDEFGHIJ";
        String expected = "AEIBDFHJCG";

        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert(input, 3);

        assertEquals(expected, result);
    }

    @Test
    public void testCase02() {
        String input = "ABCDEFGHIJKLMNOPQRSTUV";
        int numRows = 3;
        String expected = "AEIMQUBDFHJLNPRTVCGKOS";

        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert(input, numRows);

        assertEquals(expected, result);
    }

    @Test
    public void testCase03() {
        String input = "ABCDEFGHIJKLMNOPQRSTUV";
        int numRows = 4;
        String expected = "AGMSBFHLNRTCEIKOQUDJPV";

        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert(input, numRows);

        assertEquals(expected, result);
    }

    @Test
    public void testCase04() {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int numRows = 5;
        String expected = "AIQYBHJPRXZCGKOSWDFLNTVEMU";

        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert(input, numRows);

        assertEquals(expected, result);
    }

    @Test
    public void testCase05() {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int numRows = 6;
        String expected = "AKUBJLTVCIMSWDHNRXEGOQYFPZ";

        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert(input, numRows);

        assertEquals(expected, result);
    }

    @Test
    public void testCase06() {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int numRows = 7;
        String expected = "AMYBLNXZCKOWDJPVEIQUFHRTGS";


        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert(input, numRows);

        assertEquals(expected, result);
    }

    @Test
    public void testCase07() {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int numRows = 8;
        String expected = "AOBNPCMQDLRZEKSYFJTXGIUWHV";


        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert(input, numRows);

        assertEquals(expected, result);
    }

    @Test
    public void testCase08() {
        String input = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";


        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert(input, numRows);

        assertEquals(expected, result);
    }

    @Test
    public void testCase09() {
        String input = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";


        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert(input, numRows);

        assertEquals(expected, result);
    }

    @Test
    public void testCase10() {
        String input = "A";
        int numRows = 4;
        String expected = "A";

        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert(input, numRows);

        assertEquals(expected, result);
    }

    @Test
    public void testCase11() {
        String input = "AB";
        int numRows = 4;
        String expected = "AB";

        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert(input, numRows);

        assertEquals(expected, result);
    }

    @Test
    public void testCase12() {
        String input = "AB";
        int numRows = 1;
        String expected = "AB";

        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert(input, numRows);

        assertEquals(expected, result);
    }

}