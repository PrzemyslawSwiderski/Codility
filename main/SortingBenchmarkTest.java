import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class SortingBenchmarkTest {

    public static void main(String[] args) {
        List<Sorter> sorters = List.of(
                new BubbleSort1(),
                new BubbleSort2(),
                new ShakerSort(),
                new QuickSorter1(),
                new QuickSorter2(),
                new QuickSorter3(),
                new MergeSorter(),
                new MergeSorter2()
        );
        int[][] testCases = new int[][]{
                {1, 1, 1, 1, 1},
                {9, 8, 7, 6, 5, 4, 3},
                {1, 2, 3, 4, 5, 6, 7},
                {4, 2, 3, 1, 5, 6, 7},
                {4, 3, 2, 1, 7, 5, 6},
                {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                {7, -1, -1, 15, 6, 5, -2, 0, 1, 0, 2, 4, 11},
                IntStream.generate(() -> new Random().nextInt(100)).limit(1000).toArray()
        };

        int testCaseNum = 1;
        for (int[] arr : testCases) {
            System.out.println("TEST CASE " + testCaseNum);
            System.out.println("TEST ARRAY " + Arrays.toString(arr));
            for (Sorter sorter : sorters) {
                int[] testArr = arr.clone();
                sorter.sort(testArr);
                System.out.println("Name: " + sorter.sortingName() + " | Calls count: " + sorter.getCallsCount() + " | Swaps count: " + sorter.getSwapCount());
                System.out.println(Arrays.toString(testArr));
                sorter.reset();
            }
            testCaseNum++;
        }

    }
}
