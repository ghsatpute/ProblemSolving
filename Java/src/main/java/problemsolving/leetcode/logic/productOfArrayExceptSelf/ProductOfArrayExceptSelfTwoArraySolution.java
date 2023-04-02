package problemsolving.leetcode.logic.productOfArrayExceptSelf;

public class ProductOfArrayExceptSelfTwoArraySolution {
    public int[] productExceptSelf(int[] nums) {
        /*
        Idea is to have two arrays which will store the product.
        The a[i] prefix product array will store, the product of all the elements
        from 0 to i.
        The postfix product array will store, the product of all the elements from
        i to n;
        Then to get product of all elements except self at i'th location, we can multiply
        pre[i-1] * post[i+1]
        */

        int[] preProducts = new int[nums.length];
        int[] postProducts = new int[nums.length];

        preProducts[0] = nums[0];

        for (int i = 1; i < nums.length; i++ ) {
            preProducts[i] = preProducts[i-1] * nums[i];
        }

        postProducts[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i-- ) {
            postProducts[i] = postProducts[i+1] * nums[i];
        }

        // For example, [1,2,3,4]
        // preProducts would be = [1, 2, 6, 24]
        // postProducts would be = [24, 24, 12, 4]
        // output would be => [24, 12, 8, 6]

        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int preProduct = i - 1 < 0 ? 1 : preProducts[i - 1];
            int postProduct = i + 1 >= nums.length ? 1: postProducts[i + 1];
            output[i] = preProduct * postProduct;
        }

        return output;
    }
}
