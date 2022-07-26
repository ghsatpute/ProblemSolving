package problemsolving.leetcode.logic.excelSheetColumnNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnNumberTest {
  @Test
  public void testCase01() {
    int output = ExcelSheetColumnNumber.titleToNumber("A");

    assertEquals(1, output);
  }

  @Test
  public void testCase02() {
    int output = ExcelSheetColumnNumber.titleToNumber("Z");

    assertEquals(26, output);
  }

  @Test
  public void testCase03() {
    int output = ExcelSheetColumnNumber.titleToNumber("AB");

    assertEquals(28, output);
  }

  @Test
  public void testCase04() {
    int output = ExcelSheetColumnNumber.titleToNumber("ZY");

    assertEquals(701, output);
  }
}