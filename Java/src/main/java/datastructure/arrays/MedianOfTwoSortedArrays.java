package datastructure.arrays;

public class MedianOfTwoSortedArrays {
    public double solution(int[] array1, int[] array2) {
        int start = 0;
        int end = array1.length - 1;

        if(isNonIntersectingArrays(array1, array2)) {
            return getMedianFromNonIntersectingArrays(array1, array2);
        }

        while (true) {
            int partitionX = start + (end - start)/ 2;
            int partitionY = ((array1.length + array2.length) / 2) - partitionX;

            if ((array1[partitionX - 1] <= array2[partitionY])
                && (partitionY < 1 || array2[partitionY - 1] <= array1[partitionX])) {

                int numLeftElementsInBothArrays = partitionX + partitionY;
                int numRightElementsInBothArrays = (array1.length - partitionX) + (array2.length - partitionY);

                if (numLeftElementsInBothArrays == numRightElementsInBothArrays) {
                    return (Math.max(array1[partitionX - 1], array2[partitionY - 1])
                            + Math.min(array1[partitionX], array2[partitionY])) / 2.0;
                } else if (numLeftElementsInBothArrays > numRightElementsInBothArrays){
                    return Math.max(array1[partitionX - 1], array2[partitionY - 1]);
                } else {
                    return Math.min(array1[partitionX], array2[partitionY]);
                }
            } else if (array1[partitionX - 1] < array2[partitionY]
                && array2[partitionY - 1] > array1[partitionX]) {

                start = partitionX + 1;
            } else if (array1[partitionX - 1] > array2[partitionY]
                    && array2[partitionY - 1] < array1[partitionX]) {

                end = partitionX - 1;
            } else {
                // This condition means the array is not sorted
                throw new RuntimeException(
                        String.format("Arrays seems to be not sorted. The numbers from first array are %s %s" +
                                              " and the numbers from second array  %s %s", array1[partitionX - 1],
                                      array2[partitionY], array2[partitionY - 1], array1[partitionX]));
            }
        }
    }

    private double getMedianFromNonIntersectingArrays(int[] array1, int[] array2) {
        int combinedLength = array1.length + array2.length;
        if (combinedLength % 2 == 0) {
            int left = getElementFromCombinedArray(array1, array2, (combinedLength/2) - 1);
            int right = getElementFromCombinedArray(array1, array2, combinedLength/2);
            return (left + right) / 2.0;
        } else {
            return getElementFromCombinedArray(array1, array2, combinedLength/2);
        }
    }

    private boolean isNonIntersectingArrays(int[] array1, int[] array2) {
        if (array1[array1.length - 1] < array2[0]) {
            return true;
        }
        if (array2[array2.length - 1] < array1[0]) {
            return true;
        }
        return false;
    }

    private int getElementFromCombinedArray(int[] array1, int[] array2, int index) {
        if (array2[array2.length - 1] < array1[0]) {
            return getElementFromCombinedArray(array2, array1, index);
        }

        if (index < array1.length) {
            return array1[index];
        } else {
            return array2[index - array1.length];
        }
    }
}
