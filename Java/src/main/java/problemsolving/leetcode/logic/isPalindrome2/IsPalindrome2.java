package problemsolving.leetcode.logic.isPalindrome2;

public class IsPalindrome2 {
    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        return isValidPalindrome(s, 0);
    }

    public boolean isValidPalindrome(String s, int numChanges) {
        int first = 0;
        int last = s.length() - 1;
        while (first <= last) {
            if (s.charAt(first) != s.charAt(last)) {
                if (numChanges > 0) {
                    break;
                }

                boolean isValid = false;
                if (first < s.length() - 2 && s.charAt(first + 1) == s.charAt(last)) {
                    isValid = isValidPalindrome(s.substring(first + 1, last + 1), 1);
                }
                if (isValid) {
                    return true;
                }

                if (last >= 1 && s.charAt(first) == s.charAt(last - 1)) {
                    isValid = isValidPalindrome(s.substring(first, last), 1);
                }
                return isValid;
            }
            first++;
            last--;
        }

        return first >= last;
    }
}
