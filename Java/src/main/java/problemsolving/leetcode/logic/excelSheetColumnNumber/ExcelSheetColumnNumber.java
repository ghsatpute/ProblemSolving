package problemsolving.leetcode.logic.excelSheetColumnNumber;

public class ExcelSheetColumnNumber {
  public static void main(String[] args) {
    System.out.println(titleToNumber("A"));
  }
  public static int titleToNumber(String columnTitle) {
    int currentPower = 0;
    int output = 0;

    for (int i = columnTitle.length() - 1; i >= 0; i--) {
      int multiplier = columnTitle.charAt(i) - 'A' + 1;

      output += multiplier * Math.pow(26, currentPower);
      currentPower++;
    }

    return output;
  }
}
