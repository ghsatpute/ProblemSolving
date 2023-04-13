package problemsolving.leetcode.datastructures.graphs.courseSchedule;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] visiting = new int[numCourses];

        Map<Integer, Stack<Integer>> courseDeps = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            courseDeps.put(i, new Stack<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            courseDeps.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(visiting, courseDeps, i)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int[] visiting, Map<Integer, Stack<Integer>> courseDeps, int currentCourse) {
        // Means we've detected a cycle
        if (visiting[currentCourse] == 1) {
            return false;
        }

        visiting[currentCourse] = 1;

        Stack<Integer> currentCourseDeps = courseDeps.get(currentCourse);

        while (currentCourseDeps.size() != 0) {
            int nextCourse = currentCourseDeps.peek();
            if(!dfs(visiting, courseDeps, nextCourse)) {
                return false;
            }
            currentCourseDeps.pop();
        }

        // If we reach here, means all the courses are completed. Mark current course complete and return true;
        visiting[currentCourse] = 2;
        return true;
    }
}
