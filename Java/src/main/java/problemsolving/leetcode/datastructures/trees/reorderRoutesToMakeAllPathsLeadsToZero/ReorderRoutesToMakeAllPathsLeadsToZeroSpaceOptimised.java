package problemsolving.leetcode.datastructures.trees.reorderRoutesToMakeAllPathsLeadsToZero;

import java.util.ArrayList;
import java.util.List;

public class ReorderRoutesToMakeAllPathsLeadsToZeroSpaceOptimised {
    private final List<List<Integer>> neighbours =  new ArrayList<>();
    private boolean[] visited;
    public int minReorder(int n, int[][] connections) {
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            neighbours.add(i, new ArrayList<>());
        }

        for (int[] connection: connections) {
            // For a given connection[source, destination],
            // add a positive link from source to destination,
            // and add a negative link from destination to source.
            // We're doing this so that we can traverse both ways
            neighbours.get(connection[0]).add(connection[1]);
            neighbours.get(connection[1]).add(-connection[0]);
        }

        return countInversions(0);
    }

    private int countInversions(int root) {
        visited[root] = true;
        int inversions = 0;

        for (int neighbour: neighbours.get(root)) {
            // Here, we're storing negative numbers for destination to source paths so need to do Math.abs
            if (visited[Math.abs(neighbour)]) {
                continue;
            }

            // We're traversing from root i.e. zero to outwards so
            // if any path exists from root to neighbour, that means that needs to
            // be inverted. And we'll count that as inversion
            if (neighbour > 0) {
                inversions += 1;
            }

            // While traversing we don't care about the signage so always pass root as positive
            inversions += countInversions(Math.abs(neighbour));
        }

        return inversions;
    }
}
