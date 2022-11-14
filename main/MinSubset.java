import java.util.*;

public class MinSubset {

    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        var maxSize = 0;
        var queue = new ArrayDeque<Set<Integer>>();
        queue.add(new HashSet<>(s));

        while (!queue.isEmpty()) {
            var current = queue.pop();

            if (!isDivisible(k, new ArrayList<>(current))) {
                return current.size();
            }

            for (int i : current) {
                var sub = new HashSet<>(current);
                sub.remove(i);
                queue.add(sub);
            }
        }

        return maxSize;
    }

    public static boolean isDivisible(int k, List<Integer> s) {
        for (int i = 0; i < s.size() - 1; i++) {
            for (int j = i + 1; j < s.size(); j++) {
                if ((s.get(i) + s.get(j)) % k == 0) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        var k = 3;
        var s = List.of(1, 7, 2, 4);
        System.out.println("Solution: " + nonDivisibleSubset(k, s));


    }
}
