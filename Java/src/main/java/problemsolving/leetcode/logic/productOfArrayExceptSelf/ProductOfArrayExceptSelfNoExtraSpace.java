package problemsolving.leetcode.logic.productOfArrayExceptSelf;

public class ProductOfArrayExceptSelfNoExtraSpace {
    public int[] productExceptSelf(int[] nums) {
        /*
        Previous solution:
        Idea is to have two arrays which will store the product.
        The a[i] prefix product array will store, the product of all the elements
        from 0 to i.
        The postfix product array will store, the product of all the elements from
        i to n;
        Then to get product of all elements except self at i'th location, we can multiply
        pre[i-1] * post[i+1]

        In this solution:
        Instead of using additional array to store the products, we can store them in the same output
        array to save additional space.
        */

        int[] output = new int[nums.length];

        // For example, for input [1,2,3,4]
        // Tracing for below iteration
        // output = [1, 0, 0, 0]
        // preProduct = 1
        // i = 1
        //      output = [1, 1, 0, 0]
        //      preProduct = 1 * 2 = 2
        // i = 2
        //      output = [1, 1, 2, 0]
        //      preProduct = 2 * 3 = 6
        // i = 3
        //      output = [1, 1, 2, 6]
        //      preProduct = 2 * 3 = 24

        // output => [1, 1, 2, 6]

        int preProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = preProduct;
            preProduct *= nums[i];
        }

        // For example, for input [1,2,3,4]
        // output from previous step = [1, 1, 2, 6]
        // postProduct = 1
        // i = 3
        //      output[3] =  postProduct * output[i] = 1 * 6 = 6
        //      postProduct = postProduct * nums[i] = 1 * 4 = 4
        // i = 2
        //      output[2] =  postProduct * output[i] = 4 * 2 = 8
        //      postProduct = 4 * 3 = 12
        // i = 1
        //      output[1] =  postProduct * output[i] = 12 * 1 = 12
        //      postProduct = 12 * 2 = 24
        // i = 0
        //      output[1] =  postProduct * output[i] = 24 * 1 = 24
        //      postProduct = 24 * 1 = 24

        int postProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] = postProduct * output[i];
            postProduct *= nums[i];
        }

        return output;
    }
}
