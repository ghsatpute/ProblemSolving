package algorithms.greedy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HuffmanCodingTest {

    @Test
    public void testHuffmanCoding_example1() {
        String input = "BCCABBDDAECCBBAEDDCC"; // BCCAB BDDAE CCBBA EDDCC
        // A = 3
        // B = 5
        // C = 6
        // D = 4
        // E = 2
        HuffmanCoding.HuffmanCodingResult huffmanCodingResult = HuffmanCoding.encode(input);

        assertEquals("101", huffmanCodingResult.codes.get('A'));
        assertEquals("01", huffmanCodingResult.codes.get('B'));
        assertEquals("11", huffmanCodingResult.codes.get('C'));
        assertEquals("00", huffmanCodingResult.codes.get('D'));
        assertEquals("100", huffmanCodingResult.codes.get('E'));
        assertNotNull(huffmanCodingResult.encodedSting);
    }

    @Test
    public void testHuffmanCoding_example2() {
        String input = "ABBCCCDDDEEEEEFFFFF";
        // A = 1
        // B = 2
        // C = 3
        // D = 4
        // E = 5
        // F = 6
        HuffmanCoding.HuffmanCodingResult huffmanCodingResult = HuffmanCoding.encode(input);

        assertEquals("1110", huffmanCodingResult.codes.get('A'));
        assertEquals("1111", huffmanCodingResult.codes.get('B'));
        assertEquals("110", huffmanCodingResult.codes.get('C'));
        assertEquals("00", huffmanCodingResult.codes.get('D'));
        assertEquals("01", huffmanCodingResult.codes.get('E'));
        assertEquals("10", huffmanCodingResult.codes.get('F'));
        assertNotNull(huffmanCodingResult.encodedSting);
    }

    @Test
    public void testHuffmanCoding_example3() {
        String input = "AAAAAABBBBBCCCCDDDEEF";
        // A = 6
        // B = 5
        // C = 4
        // D = 3
        // E = 2
        // F = 1
        HuffmanCoding.HuffmanCodingResult huffmanCodingResult = HuffmanCoding.encode(input);

        assertEquals("11", huffmanCodingResult.codes.get('A'));
        assertEquals("01", huffmanCodingResult.codes.get('B'));
        assertEquals("00", huffmanCodingResult.codes.get('C'));
        assertEquals("100", huffmanCodingResult.codes.get('D'));
        assertEquals("1011", huffmanCodingResult.codes.get('E'));
        assertEquals("1010", huffmanCodingResult.codes.get('F'));
        assertNotNull(huffmanCodingResult.encodedSting);
    }
}
