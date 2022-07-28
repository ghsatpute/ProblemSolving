package problemsolving.leetcode.logic.rangeInExcelSheet;

import java.util.ArrayList;
import java.util.List;

public class RangeInExcelSheet {
  public static List<String> cellsInRange(String s) {
    List<String> output = new ArrayList<>();

    for (int column = s.charAt(0); column <= s.charAt(3); column++) {
      for (int row = s.charAt(1); row <= s.charAt(4); row++) {
        output.add("" + (char) column + (char) row);
      }
    }

    return output;
  }
}
