package problemsolving.problems.logic;

import java.util.ArrayList;
import java.util.List;

public class AllInterleavingOfTwoStrings {
    // https://www.geeksforgeeks.org/print-all-interleavings-of-given-two-strings/
    public static List<String> solve(String string1, String string2) {
        List<String> output = new ArrayList<>();
        solve(string1, string2, 0, 0, "", output);
        return output;
    }

    private static void solve(String string1, String string2, int m, int n, String currentString, List<String> strings) {
        if (m == string1.length() && n == string2.length()) {
            strings.add(currentString);
            return;
        }

        // Choose from first string
        if (m < string1.length()) {
            solve(string1, string2, m + 1, n, currentString + string1.charAt(m), strings);
        }

        // Choose from second string
        if (n < string2.length()) {
            solve(string1, string2, m, n + 1, currentString + string2.charAt(n), strings);
        }
    }
}
