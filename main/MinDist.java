// Given a non-empty array of integers, every element appears twice except for one. Find that single one.

import java.util.HashMap;
import java.util.List;

public class MinDist {

    private static int findMinDist(List<Integer> arr) {
        int minDist = Integer.MAX_VALUE;
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.size(); i++) {
            var curr = arr.get(i);
            if (map.containsKey(curr)) {
                var idx = map.get(curr);
                var dist = i - idx;
                if (dist < minDist) {
                    minDist = dist;
                    map.put(curr, i);
                }
            } else {
                map.put(curr, i);
            }
        }

        if (minDist == Integer.MAX_VALUE) return -1;
        else return minDist;
    }

    public static void main(String[] args) {
        var list = List.of(7, 2, 3, 0, 4, 1, 7);

        int dist = findMinDist(list);
        System.out.println(dist);
    }
}
