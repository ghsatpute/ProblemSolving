package problemsolving.leetcode.logic.addBinary;

public class AddBinary {
  public static String addBinary(String a, String b) {
    int aLength = a.length();
    int bLength = b.length();


    int maxLength = aLength;
    if (bLength > aLength) {
      maxLength = bLength;
      bLength = aLength;
      aLength = maxLength;

      String temp = b;
      b = a;
      a = temp;
    }

    String output = "";
    int carry = 0;

    for (int i = 0; i < maxLength; i++) {
      int sum = Integer.parseInt(a.charAt(maxLength-i-1) + "");

      sum += (bLength - i-1) >= 0 ? Integer.parseInt(b.charAt(bLength - i - 1) + "") : 0;
      sum += carry;

      if (sum == 3) {
        output = 1 + output;
        carry = 1;
      } else if (sum == 2){
        output = 0 + output;
        carry = 1;
      } else if (sum == 1){
        output = 1 + output;
        carry = 0;
      } else {
        output = 0 + output;
        carry = 0;
      }
    }

    if (carry == 1) {
      output = 1 + output;
    }

    return output;
  }
}
