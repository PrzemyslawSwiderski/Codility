import java.util.Arrays;
import java.util.List;

public class ContainersOfBalls {

    public static String organizingContainers(List<List<Integer>> container) {
        int[][] containersArray = container.stream().map(x -> x.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
        // Write your code here
        int[] containerSums = new int[containersArray.length];
        int[] ballTypeSums = new int[containersArray.length];
        for (int i = 0; i < containersArray.length; i++) {
            for (int j = 0; j < containersArray.length; j++) {
                containerSums[i] = containerSums[i] + containersArray[i][j];
                ballTypeSums[i] = ballTypeSums[i] + containersArray[j][i];
            }
        }
        Arrays.sort(containerSums);
        Arrays.sort(ballTypeSums);

        return Arrays.equals(containerSums, ballTypeSums) ? "Possible" : "Impossible";
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
