package problemsolving.leetcode.datastructures.graphs.courseSchedule;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CourseScheduleTest {
    @Test
    public void testCase01() {
        int numCourses = 2;
        int[][] dependencyGraph = {{1,0}};

        boolean canFinish = new CourseSchedule().canFinish(numCourses, dependencyGraph);

        assertTrue(canFinish);
    }

    @Test
    public void testCase02() {
        int numCourses = 2;
        int[][] dependencyGraph = {{1,0}, {0, 1}};

        boolean canFinish = new CourseSchedule().canFinish(numCourses, dependencyGraph);

        assertFalse(canFinish);
    }

    @Test
    public void testCase03() {
        int numCourses = 5;
        int[][] dependencyGraph = {{1,4},{2,4},{3,1},{3,2}};
        

        boolean canFinish = new CourseSchedule().canFinish(numCourses, dependencyGraph);

        assertTrue(canFinish);
    }
}