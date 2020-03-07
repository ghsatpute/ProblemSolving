package algorithms.greedy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class JobSchedulingTest {

    @Test
    public void testSchedule_testCase01() {
        // Setup
        List<JobScheduling.Job> jobs = new ArrayList<>();
        JobScheduling.Job job35 = createJob(35, 3);
        jobs.add(job35);
        JobScheduling.Job job30 = createJob(30, 3);
        jobs.add(job30);
        JobScheduling.Job job25 = createJob(25, 4);
        jobs.add(job25);
        JobScheduling.Job job20 = createJob(20, 2);
        jobs.add(job20);
        JobScheduling.Job job15 = createJob(15, 3);
        jobs.add(job15);
        JobScheduling.Job job12 = createJob(12, 3);
        jobs.add(job12);
        JobScheduling.Job job5 = createJob(5, 2);
        jobs.add(job5);

        // Execute
        List<JobScheduling.Job> schedule = JobScheduling.schedule(jobs);

        // verify
        assertNotNull(schedule);
        assertEquals(4, schedule.size());
        assertTrue(schedule.contains(job35));
        assertTrue(schedule.contains(job30));
        assertTrue(schedule.contains(job25));
        assertTrue(schedule.contains(job20));
    }

    private JobScheduling.Job createJob(int profit, int deadline) {
        JobScheduling.Job job = new JobScheduling.Job();
        job.profit = profit;
        job.deadline = deadline;
        return job;
    }

}