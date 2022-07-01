package problemsolving.leetcode.logic.addBinary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

  @Test
  public void testCase01() {
    String a = "01";
    String b = "1";

    String output = AddBinary.addBinary(a, b);

    assertEquals("10", output);
  }

  @Test
  public void testCase02() {
    String a = "1111";
    String b = "1111";

    String output = AddBinary.addBinary(a, b);

    assertEquals("11110", output);
  }
}