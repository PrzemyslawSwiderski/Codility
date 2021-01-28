import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// O(n) solution for finding smallest subarray with sum
// greater than x
public class MinimumSwaps {

    public static void main(String[] args) {
        int[] arr1 = {7, 1, 3, 2, 4, 5, 6};
        int res1 = minimumSwaps(arr1);
        System.out.println(res1);

        int[] arr2 = {1, 3, 5, 2, 4, 6, 7};
        int res2 = minimumSwaps(arr2);
        System.out.println(res2);

    }

    private static int minimumSwaps(int[] arr) {
        int minimumSwaps = 0;
        int[] refArray = arr.clone();
        Arrays.sort(refArray);

        Map<Integer, Integer> entries = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            entries.put(i, arr[i]);
        }

        for (Map.Entry<Integer, Integer> entry : entries.entrySet()) {
            int index = entry.getKey();
            if (refArray[index] != entry.getValue())
                minimumSwaps++;
        }

        return minimumSwaps - 1; // last swap was already done
    }
}
