import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        int[] sorted = bubbleSort.solution(new int[]{2, -1, 3, 1, 6, 0, 1, 5, 7});
        System.out.println(Arrays.toString(sorted));
    }

}
