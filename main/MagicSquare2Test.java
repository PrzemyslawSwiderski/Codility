import java.util.List;

public class MagicSquare2Test {

    public static int formingMagicSquare(List<List<Integer>> s) {
        List<List<List<Integer>>> magicSquares = List.of(
                List.of(List.of(8, 1, 6), List.of(3, 5, 7), List.of(4, 9, 2)),
                List.of(List.of(6, 1, 8), List.of(7, 5, 3), List.of(2, 9, 4)),
                List.of(List.of(4, 9, 2), List.of(3, 5, 7), List.of(8, 1, 6)),
                List.of(List.of(2, 9, 4), List.of(7, 5, 3), List.of(6, 1, 8)),
                List.of(List.of(8, 3, 4), List.of(1, 5, 9), List.of(6, 7, 2)),
                List.of(List.of(4, 3, 8), List.of(9, 5, 1), List.of(2, 7, 6)),
                List.of(List.of(6, 7, 2), List.of(1, 5, 9), List.of(8, 3, 4)),
                List.of(List.of(2, 7, 6), List.of(9, 5, 1), List.of(4, 3, 8))
        );

        int minDistance = Integer.MAX_VALUE;
        for (List<List<Integer>> magicSquare : magicSquares) {
            int dist = 0;
            for (int i = 0; i < s.size(); i++) {
                for (int j = 0; j < s.size(); j++) {
                    dist += Math.abs(magicSquare.get(i).get(j) - s.get(i).get(j));
                }
            }
            if (dist < minDistance) minDistance = dist;
        }

        return minDistance;
    }

    public static void main(String[] args) {

        // INPUT
        // 5 3 4
        // 1 5 8
        // 6 4 2

        // MAGIC SQUARE
        // 8 3 4
        // 1 5 9
        // 6 7 2

        // cost = 7

        List<List<Integer>> inputArray = List.of(
                List.of(5, 3, 4),
                List.of(1, 5, 8),
                List.of(6, 4, 2)
        );
        int minDist = formingMagicSquare(inputArray);
        System.out.println("Min dist: " + minDist);
    }
}
