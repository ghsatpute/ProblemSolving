package problemsolving.leetcode.algorithm.dynamicProgramming.editDistance;

import org.junit.Assert;
import org.junit.Test;

public class EditDistanceTest {
    @Test
    public void bruteForce_testCase01() {
        String word1 = "horse";
        String word2 = "ros";

        int output = new EditDistance().minDistanceBruteForce(word1, word2);

        Assert.assertEquals(3, output);
    }

    @Test
    public void bruteForce_testCase02() {
        String word1 = "intention";
        String word2 = "execution";

        int output = new EditDistance().minDistanceBruteForce(word1, word2);

        Assert.assertEquals(5, output);
    }

    @Test
    public void bruteForce_testCase03() {
        String word1 = "abad";
        String word2 = "abac";

        int output = new EditDistance().minDistanceBruteForce(word1, word2);

        Assert.assertEquals(1, output);
    }

    @Test
    public void bruteForce_testCase04() {
        String word1 = "Anshuman";
        String word2 = "Antihuman";

        int output = new EditDistance().minDistanceBruteForce(word1, word2);

        Assert.assertEquals(2, output);
    }

    @Test
    public void bruteForce_testCase05() {
        String word1 = "gfg";
        String word2 = "gfg";

        int output = new EditDistance().minDistanceBruteForce(word1, word2);

        Assert.assertEquals(0, output);
    }

    @Test
    public void bruteForce_testCase06() {
        String word1 = "cat";
        String word2 = "cut";

        int output = new EditDistance().minDistanceBruteForce(word1, word2);

        Assert.assertEquals(1, output);
    }

    @Test
    public void bruteForce_testCase07() {
        String word1 = "sunday";
        String word2 = "saturday";

        int output = new EditDistance().minDistanceBruteForce(word1, word2);

        Assert.assertEquals(3, output);
    }

    @Test
    public void bruteForce_testCase08() {
        String word1 = "gfg";
        String word2 = "gfg";

        int output = new EditDistance().minDistanceBruteForce(word1, word2);

        Assert.assertEquals(0, output);
    }

//    public void bruteForce_testCase09() {
//        String word1 = "abcdefghijklmnopqrstuvwxyz";
//        String word2 = "aaaaaaaaaaaaaaaaaaaaaaaaaa";
//
//        int output = new EditDistance().minDistanceBruteForce(word1, word2);
//
//        Assert.assertEquals(23, output);
//    }

    @Test
    public void dynamicProgramming_testCase01() {
        String word1 = "horse";
        String word2 = "ros";

        int output = new EditDistance().minDistance(word1, word2);

        Assert.assertEquals(3, output);
    }

    @Test
    public void dynamicProgramming_testCase02() {
        String word1 = "intention";
        String word2 = "execution";

        int output = new EditDistance().minDistance(word1, word2);

        Assert.assertEquals(5, output);
    }

    @Test
    public void dynamicProgramming_testCase03() {
        String word1 = "abad";
        String word2 = "abac";

        int output = new EditDistance().minDistance(word1, word2);

        Assert.assertEquals(1, output);
    }

    @Test
    public void dynamicProgramming_testCase04() {
        String word1 = "Anshuman";
        String word2 = "Antihuman";

        int output = new EditDistance().minDistance(word1, word2);

        Assert.assertEquals(2, output);
    }

    @Test
    public void dynamicProgramming_testCase05() {
        String word1 = "gfg";
        String word2 = "gfg";

        int output = new EditDistance().minDistance(word1, word2);

        Assert.assertEquals(0, output);
    }

    @Test
    public void dynamicProgramming_testCase06() {
        String word1 = "cat";
        String word2 = "cut";

        int output = new EditDistance().minDistance(word1, word2);

        Assert.assertEquals(1, output);
    }

    @Test
    public void dynamicProgramming_testCase07() {
        String word1 = "sunday";
        String word2 = "saturday";

        int output = new EditDistance().minDistance(word1, word2);

        Assert.assertEquals(3, output);
    }

    @Test
    public void dynamicProgramming_testCase08() {
        String word1 = "gfg";
        String word2 = "gfg";

        int output = new EditDistance().minDistance(word1, word2);

        Assert.assertEquals(0, output);
    }


    @Test
    public void dynamicProgramming_testCase09() {
        String word1 = "abcdefghijklmnopqrstuvwxyz";
        String word2 = "aaaaaaaaaaaaaaaaaaaaaaaaaa";

        int output = new EditDistance().minDistance(word1, word2);

        Assert.assertEquals(25, output);
    }
}