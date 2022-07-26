package problemsolving.leetcode.logic.excelSheetColumnTitle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnTitleTest {

  @Test
  public void testCaseO1() {
    String output = ExcelSheetColumnTitle.convertToTitle(1);

    assertEquals("A", output);
  }

  @Test
  public void testCaseO2() {
    String output = ExcelSheetColumnTitle.convertToTitle(28);

    assertEquals("AB", output);
  }

  @Test
  public void testCaseO3() {
    String output = ExcelSheetColumnTitle.convertToTitle(701);

    assertEquals("ZY", output);
  }

  @Test
  public void testCaseO4() {
    String output = ExcelSheetColumnTitle.convertToTitle(2147483647);

    assertEquals("FXSHRXW", output);
  }

}