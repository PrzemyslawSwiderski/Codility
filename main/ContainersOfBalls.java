import java.util.List;

public class ContainersOfBalls {


    private static boolean isPossible(int[][] containersArray) {
        if (containersArray.length == 0) return true;
        for (int currentContainer = 0; currentContainer < containersArray[0].length; currentContainer++) {
            for (int typesColumn = 0; typesColumn < containersArray.length; typesColumn++) {
                if (typesColumn != currentContainer && containersArray[currentContainer][typesColumn] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String organizingContainers(List<List<Integer>> container) {
        int[][] containersArray = container.stream().map(x -> x.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
        // Write your code here


        while (true) {
            boolean changed = false;

            for (int i = 0; i < containersArray.length; i++) {
                for (int j = 0; j < containersArray[i].length; j++) {
                    if (i != j) {
                        int currentTypeCount = containersArray[i][i];
                        int currentOtherTypeCount = containersArray[i][j];

                        int oppositeTypeCount = containersArray[j][j];
                        int oppositeOtherTypeCount = containersArray[j][i];

                        while (currentOtherTypeCount > 0 && oppositeOtherTypeCount > 0) {
                            currentTypeCount++;
                            currentOtherTypeCount--;
                            oppositeOtherTypeCount--;
                            oppositeTypeCount++;
                            changed = true;
                        }
                        containersArray[i][i] = currentTypeCount;
                        containersArray[i][j] = currentOtherTypeCount;
                        containersArray[j][j] = oppositeTypeCount;
                        containersArray[j][i] = oppositeOtherTypeCount;
                    }
                }
            }

            if (!changed) break;
        }

        return isPossible(containersArray) ? "Possible" : "Impossible";
    }

    public static void main(String[] args) {

        var test = List.of(
                List.of(0, 2, 1),
                List.of(1, 1, 1),
                List.of(2, 0, 0)
        );
//        var test = List.of(
//                List.of(5, 5, 5, 5),
//                List.of(5, 5, 5, 5),
//                List.of(5, 5, 5, 5),
//                List.of(5, 5, 5, 5)
//        );
//        var test = List.of(
//                List.of(1, 3, 1),
//                List.of(2, 1, 2),
//                List.of(3, 3, 3)
//        );
//        var test = List.of(
//                List.of(2, 0),
//                List.of(0, 2)
//        );

        String result = organizingContainers(test);

        System.out.println("Result: " + result);

    }
}
