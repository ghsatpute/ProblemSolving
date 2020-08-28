package problemsolving.leetcode.logic.sumOfEvenNumbersAfterQueries;

public class SumOfEvenNumbersAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] answer = new int[queries.length];
        int index = 0;
        int sum = 0;
        for (int i: A) {
            if (isEven(i)) sum += i;
        }

        for (int[] query: queries) {
            int originalNumber = A[query[1]];
            A[query[1]] += query[0];
            int newNumber = A[query[1]];

            if (isOdd(originalNumber) && isEven(newNumber)) {
                sum += newNumber;
            }
            if (isEven(originalNumber) && isOdd(newNumber)) {
                sum -= originalNumber;
            }

            if (isEven(originalNumber) && isEven(newNumber)) {
                sum += (newNumber - originalNumber);
            }


            answer[index++] = sum;
        }

        return answer;
    }

    private static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    private static boolean isEven(int num) {
        return !isOdd(num);
    }
}
