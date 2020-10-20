package problemsolving.problems.logic;

import java.util.ArrayList;
import java.util.List;

public class PossibleDecodingsOfDigits {
    // https://www.geeksforgeeks.org/count-possible-decodings-given-digit-sequence/

    public static List<String> solve(char[] digits) {
        if (digits.length == 0) {
            return new ArrayList<>();
        }

        List<String> decodings = new ArrayList<>();

        solve(digits, 0, "", decodings);
        return decodings;
    }

    private static void solve(char[] digits, int currentIndex, String currentEncoding, List<String> decodings) {
        if (currentIndex == digits.length) {
            decodings.add(currentEncoding);
            return;
        }

        // Choose one digit
        int currentDigit = Integer.parseInt(digits[currentIndex] + "");
        solve(digits, currentIndex + 1, currentEncoding + decode(currentDigit), decodings);

        if (currentIndex < digits.length - 1
                && Integer.parseInt("" + digits[currentIndex] + digits[currentIndex + 1]) <= 26) {

            // Chose two digits
            int number = Integer.parseInt("" + digits[currentIndex] + digits[currentIndex + 1]);
            solve(digits, currentIndex + 2, currentEncoding + decode(number), decodings);
        }
    }

    private static char decode(int num) {
        return (char) (num + 64);
    }
}
