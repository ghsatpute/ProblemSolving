package problemsolving.leetcode.logic.isPalindrome;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        int first = 0;
        int last = s.length() - 1;
        while (first <= last) {
            while (first < s.length() && !Character.isLetterOrDigit(s.charAt(first))) {
                first++;
            }
            while (last > 0 && !Character.isLetterOrDigit(s.charAt(last))) {
                last--;
            }
            if (first >= s.length() || last < 0 || Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last))) {
                break;
            }
            first++;
            last--;
        }

        return first >= last;
    }
}
