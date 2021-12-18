import java.util.Arrays;

public class QuickSortTest {

    public static void main(String[] args) {
        Sorter quickSorter = new QuickSorter();
        int[] arr = new int[]{2, 3, 1, 1, 5, 1, 6, 7};

        quickSorter.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Comparisons: " + quickSorter.getCompareCount());
    }
}
