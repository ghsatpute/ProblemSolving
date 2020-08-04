package problemsolving.leetcode.datastructures.strings.firstSubString;

public class FirsttSubString {
    public int strStr(String haystack, String needle) {
        if (haystack.equals("") && needle.equals("")) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int k = i;
            int j = 0;
            while(j < needle.length() && haystack.charAt(k) == needle.charAt(j)) {
                k++;
                j++;
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
