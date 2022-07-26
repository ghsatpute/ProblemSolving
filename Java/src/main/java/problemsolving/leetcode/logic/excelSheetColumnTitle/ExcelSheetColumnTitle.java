package problemsolving.leetcode.logic.excelSheetColumnTitle;

public class ExcelSheetColumnTitle {

  public static void main(String[] args) {
    System.out.println(convertToTitle(26 * (26 ^ 2)));
  }
  public static String convertToTitle(long columnNumber) {
    StringBuilder output = new StringBuilder("");

    while (columnNumber > 0) {
      long remainder = columnNumber % 26;

      if (remainder == 0) {
        output = output.append("Z");
        columnNumber = columnNumber / 26 - 1;
      } else {
        output = output.append("" + (char)('A' + (remainder - 1)));
        columnNumber = columnNumber / 26;
      }
    }

    return output.reverse().toString();
  }
}
