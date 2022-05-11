package problemsolving.leetcode.logic.plusOne;

class PlusOne {
    public static int[] plusOne(int[] digits) {
        return iterative(digits);
    }

    public static int[] iterative(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum > 9) {
                digits[i] = sum - 10;
                carry = 1;
            } else {
                digits[i] = sum;
                carry = 0;
            }
        }

        if (carry == 0) {
            return digits;
        }

        int[] newArray = new int[digits.length + 1];
        newArray[0] = carry;

        for (int i = 0; i < digits.length; i++) {
            newArray[i+1] = digits[i];
        }
        return newArray;
    }

    public static int[] recursive(int[] digits) {
        int carry = increment(digits, 0);

        if (carry == 0) {
            return digits;
        }

        int[] newArray = new int[digits.length + 1];
        newArray[0] = carry;

        for (int i = 0; i < digits.length; i++) {
            newArray[i+1] = digits[i];
        }

        return newArray;
    }

    public static int increment(int[] digits, int index) {
        if (index == digits.length) {
            return 1;
        }

        int carry = increment(digits, index+1);

        int carryToReturn = 0;
        int sum = digits[index] + carry;
        digits[index] = sum;

        if (sum > 9) {
            digits[index] = sum - 10;
            carryToReturn = 1;
        }

        return carryToReturn;
    }
}
