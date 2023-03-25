package problemsolving.leetcode.datastructures.trees.reorderRoutesToMakeAllPathsLeadsToZero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReorderRoutesToMakeAllPathsLeadsToZeroFirstTry {
    private final Map<Integer, List<Integer>> neighbours =  new HashMap<>();
    private final Map<Integer, List<Integer>> directedNeighbours =  new HashMap<>();
    private boolean[] visited;
    public int minReorder(int n, int[][] connections) {
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            neighbours.put(i, new ArrayList<>());
            directedNeighbours.put(i, new ArrayList<>());
        }

        for (int[] connection: connections) {
            addNeighbour(neighbours, connection[0], connection[1]);
            addNeighbour(neighbours, connection[1], connection[0]);
            addNeighbour(directedNeighbours, connection[0], connection[1]);
        }

        // System.out.println(neighbours);
        // System.out.println(directedNeighbours);
        // {0=[1, 4], 1=[0, 3], 2=[3], 3=[1, 2], 4=[0, 5], 5=[4]}
        // {0=[1], 1=[3], 2=[3], 3=[], 4=[0, 5], 5=[]}

        return countInversions(0);
    }

    private int countInversions(int root) {
        visited[root] = true;
        int inversions = 0;

        for (int neighbour: neighbours.get(root)) {
            if (visited[neighbour]) {
                continue;
            }

            // We're traversing from root i.e. zero to outwards so
            // if any path exists from 0 to outwards, that means that needs to
            // be inverted. And we'll count that as inversion
            if (directedNeighbours.get(root).contains(neighbour)) {
                inversions += 1;
            }

            inversions += countInversions(neighbour);
        }

        return inversions;
    }

    private void addNeighbour(Map<Integer, List<Integer>> neighbours, int source, int destination) {
        List<Integer> currentNeighbours = neighbours.get(source);
        currentNeighbours.add(destination);
        neighbours.put(source, currentNeighbours);
    }
}
