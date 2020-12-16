package problemsolving.leetcode.logic.pathCrossing;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isPathCrossing(String path) {
        int east = 0;
        int north = 0;
        Set<String> positions = new HashSet<>();
        positions.add("0:0");
        boolean found = false;

        for (char ch: path.toCharArray()) {
            switch(ch) {
                case 'E': east++; break;
                case 'W': east--; break;
                case 'N': north++; break;
                case 'S': north--; break;
            }
            String requiredPosition = east + ":" + north;
            if (positions.contains(requiredPosition)) {
                found = true;
                break;
            } else {
                positions.add(requiredPosition);
            }
        }
        //System.out.println(positions);
        return found;
    }
}