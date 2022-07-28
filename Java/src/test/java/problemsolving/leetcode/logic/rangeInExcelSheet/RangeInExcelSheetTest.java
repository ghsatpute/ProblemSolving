package problemsolving.leetcode.logic.rangeInExcelSheet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RangeInExcelSheetTest {

  @Test
  public void testCase01() {
    List<String> output = RangeInExcelSheet.cellsInRange("K1:L2");

    List<String> expectedOutput = Arrays.asList("K1","K2","L1","L2");

    assertEquals(expectedOutput, output);
  }

  @Test
  public void testCase02() {
    List<String> output = RangeInExcelSheet.cellsInRange("A1:F1");

    List<String> expectedOutput = Arrays.asList("A1","B1","C1","D1","E1","F1");

    assertEquals(expectedOutput, output);
  }

  @Test
  public void testCase03() {
    List<String> output = RangeInExcelSheet.cellsInRange("A1:Z1");

    List<String> expectedOutput = Arrays.asList("A1","B1","C1","D1","E1","F1","G1","H1","I1","J1","K1","L1",
      "M1","N1","O1","P1","Q1","R1","S1","T1","U1","V1","W1","X1","Y1","Z1");

    assertEquals(expectedOutput, output);
  }
}
