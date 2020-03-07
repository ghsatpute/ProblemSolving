package algorithms.greedy;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobScheduling {

    public static class Job implements Comparable<Job> {
        public int profit;
        // Zero indexed
        public int deadline;


        @Override
        public int compareTo(@NotNull JobScheduling.Job o) {
            // Do reverse compare so we get max profit elements at first
            return Integer.compare(o.profit, this.profit);
        }
    }

    public static List<Job> schedule(List<Job> jobs) {
        int maxDeadline = getMaxDeadline(jobs);
        Job[] schedule = new Job[maxDeadline];
        Collections.sort(jobs);

        for (Job job: jobs) {
            if (job.deadline - 1 > maxDeadline) {
                continue;
            }

            for (int i = job.deadline - 1; i >= 0; i--) {
                if (schedule[i] == null) {
                    schedule[i] = job;
                    break;
                }
            }
        }

        return Arrays.asList(schedule);
    }

    private static int getMaxDeadline(List<Job> jobs) {
        int max = 0;
        for (Job job: jobs) {
            if (job.deadline > max) {
                max = job.deadline;
            }
        }

        return max;
    }
}
