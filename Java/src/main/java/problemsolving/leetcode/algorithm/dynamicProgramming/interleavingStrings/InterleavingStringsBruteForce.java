package problemsolving.leetcode.algorithm.dynamicProgramming.interleavingStrings;

public class InterleavingStringsBruteForce {
    String s1, s2, s3;
    public boolean isInterleave(String s1, String s2, String s3) {
        if ((s1.length() == 0 || s2.length() == 0) && s3.length() == 0) {
            return true;
        }
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;

        return isInterleave(0, 0, 0);
    }

    private boolean isInterleave(int index1, int index2, int index3) {
        // If last character to be matched is in string 1
        if (index1 == s1.length() - 1 && index2 == s2.length() && index3 == s3.length() - 1) {
            return s1.charAt(index1) == s3.charAt(index3);
        }

        // If last character to be matched is in string 2
        if (index1 == s1.length() && index2 == s2.length() - 1 && index3 == s3.length() - 1) {
            return s2.charAt(index2) == s3.charAt(index3);
        }

        // In any other case, if index is bigger than any index return false;
        if (index1 > s1.length() || index2 > s2.length() || index3 >= s3.length()) {
            return false;
        }

        boolean s1CharMatching = false, s2CharMatching = false;

        // Try to match character from s1, if index1 is less than length of string
        if (index1 < s1.length() && s1.charAt(index1) == s3.charAt(index3)) {
            s1CharMatching = isInterleave(index1 + 1, index2, index3 + 1);
        }

        // Try matching character from s2, if index2 is less than length of string
        if (index2 < s2.length() && s2.charAt(index2) == s3.charAt(index3)) {
            s2CharMatching = isInterleave(index1, index2 + 1, index3 + 1);
        }

        return s1CharMatching || s2CharMatching;
    }
}
