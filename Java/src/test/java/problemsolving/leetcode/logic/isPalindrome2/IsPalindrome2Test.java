package problemsolving.leetcode.logic.isPalindrome2;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalindrome2Test {

    @Test
    public void testCase01() {
        // LeetCode test case
        String input =
                "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";

        /*
        aguok
        epatg
        bnvfq
        mgmlc
        upuuf
        xoohd
        fpgjd
        mysgv
        hmvff
        cnqxj

        jxqnc
        ffvmh
        vgsym
        djgpf
        dhoox
        fuupu
        culmgm
        qfvnb
        gtape
        kouga
         */

        boolean output = new IsPalindrome2().validPalindrome(input);

        assertTrue(output);
    }

}