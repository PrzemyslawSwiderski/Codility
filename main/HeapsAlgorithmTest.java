import java.util.Arrays;
import java.util.List;

public class HeapsAlgorithmTest {
    private static void swap(List<Object> list, int a, int b) {
        Object temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    // Generating permutation using Heap Algorithm
    private static void heapPermutation(int k, List<Object> list) {
        // if size becomes 1 then add permutation to results list
        if (k == 1) {
            System.out.println(list);
        }

        for (int i = 0; i < k; i++) {
            heapPermutation(k - 1, list);

            // avoid swap when i==k-1
            if (i < k - 1) {

                // if size is odd, swap 0th i.e (first) and
                // (size-1)th i.e (last) element
                if (k % 2 == 1) {
                    swap(list, 0, k - 1);
                }

                // If size is even, swap ith
                // and (size-1)th i.e last element
                else {
                    swap(list, i, k - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Object> letters = Arrays.asList('A', 'B', 'C', 'D');

        heapPermutation(letters.size(), letters);
    }
}
