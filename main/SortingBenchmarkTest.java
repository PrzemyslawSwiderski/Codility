import java.util.Arrays;
import java.util.List;

public class SortingBenchmarkTest {

    public static void main(String[] args) {
        List<Sorter> sorters = List.of(
                new BubbleSort(),
                new QuickSorter()
        );
        for (Sorter sorter : sorters) {
            int[] arr = new int[]{7, -1, -1, 15, 6, 5, -2, 0, 1, 0, 2, 4, 11};
            sorter.sort(arr);
            System.out.println("Name: " + sorter.sortingName() + " | Compare operation count: " + sorter.getCompareCount());
            System.out.println(Arrays.toString(arr));
        }

    }
}
