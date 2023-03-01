package problemsolving.leetcode.logic.validNumber;

public class ValidNumber {
    public boolean isNumber(String s) {
        if (s.length() == 0) {
            return true;
        }

        String[] tokens = s.split("e");

        if (tokens.length == 0 || tokens.length > 2) {
            return false;
        }

        if (s.contains("e") && tokens.length == 1) {
            return false;
        }

        for(String token: tokens) {
            if (!isProperNumber(token)) {
                return false;
            }
        }

        return true;
    }

    private boolean isProperNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        String[] numbers = s.split("\\.");

        if (numbers.length == 0 || numbers.length > 2) {
            return false;
        }

        if (s.contains(".") && numbers.length == 1) {
            return false;
        }

        for (String number: numbers) {
            int current = 0;
            boolean containsSign = false;
            while(current < number.length() && (number.charAt(current) == '+' || number.charAt(current) == '-')) {
                containsSign = true;
                current++;
            }

            if (current >= number.length() && containsSign) {
                return false;
            }

            for (int i = current; i < number.length(); i++) {
                if (number.charAt(i) < '0' || number.charAt(i) > '9') {
                    return false;
                }
            }
        }

        return true;
    }
}
