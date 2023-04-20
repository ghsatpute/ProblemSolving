package problemsolving.leetcode.datastructures.arrays.insertInterval;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> newIntervals = new ArrayList<>();

        for (int[] interval: intervals) {
            if (interval[1] < newInterval[0]) {
                // Means current interval ends before start of newInterval, just add it to list
                newIntervals.add(interval);
            } else if(interval[0] > newInterval[1]) {
                // Means current interval ends before newInterval
                // In this case, we want result to be in sorted order. If we reach this case, means overlapping
                // of the newInterval has been completed. So we want to add it to the result.
                // To maintain the sorted order we're just assigning the current interval to newInterval
                // For each next iteration, the current interval will be assigned to the new interval
                // And at last, we will add it to the solution.
                // For example, consider input [ [1, 2], [3, 4], [5, 6], [7, 8] ] and new interval as [2, 3]
                // The combined interval for first iteration would be
                // [1, 2] ->
                //      newInterval = [1, 3]
                // [3, 4] ->
                //      newInterval = [1, 4]
                // [5, 6] ->
                //      output = [[1, 4]]
                //      newInterval = [5, 6]
                // [7, 8] ->
                //      output = [[1, 4], [5, 6]]
                //      newInterval = [7, 8]
                //
                // And at last, we would append last newInterval to the output
                // output = [[1, 4], [5, 6], [7, 8]]
                // Thus maintaining the sorted order.

                newIntervals.add(newInterval);
                newInterval = interval;
            } else {
                // If we come here, means the intervals are overlapping, in this case we expand the newInterval
                // so that it combines the current interval with new interval. So the left boundary is minimum
                // of left of current interval and new interval. Similary, right boundary will be maximum of
                // current interval and new interval.
                // This new interval maybe further expanded in later iterations of this for loop.
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }

        newIntervals.add(newInterval);

        int[][] output = new int[newIntervals.size()][];

        return newIntervals.toArray(output);
    }
}
