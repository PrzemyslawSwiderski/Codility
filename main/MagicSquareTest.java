import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MagicSquareTest {

    // Generating permutation using Heap Algorithm
    private static void heapPermutation(List<Integer> array, int size, Consumer<List<Integer>> checkMagicFunc) {
        // if size becomes 1 then add permutation to results list
        if (size == 1) {
            checkMagicFunc.accept(array);
        }

        for (int i = 0; i < size; i++) {
            heapPermutation(array, size - 1, checkMagicFunc);

            // if size is odd, swap 0th i.e (first) and
            // (size-1)th i.e (last) element
            if (size % 2 == 1) {
                int temp = array.get(0);
                array.set(0, array.get(size - 1));
                array.set(size - 1, temp);
            }

            // If size is even, swap ith
            // and (size-1)th i.e last element
            else {
                int temp = array.get(i);
                array.set(i, array.get(size - 1));
                array.set(size - 1, temp);
            }
        }
    }

    private static void checkMagic(List<Integer> nums) {
        int size = (int) Math.sqrt(nums.size());
        int idx = 0;
        List<List<Integer>> resultArray = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            resultArray.add(IntStream.of(new int[size]).boxed().collect(Collectors.toList()));
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int elem = nums.get(idx++);
                resultArray.get(i).set(j, elem);
            }

        }
        boolean magic = true;
        int magicNum;

        int colSum = 0;
        int rowSum = 0;
        int diag1Sum = 0;
        int diag2Sum = 0;
        // check if magic for the initial row/col
        for (int j = 0; j < size; j++) {
            rowSum += resultArray.get(0).get(j);
            colSum += resultArray.get(j).get(0);
            diag1Sum += resultArray.get(j).get(j);
            diag2Sum += resultArray.get(size - j - 1).get(j);
        }
        magicNum = colSum;
        if (rowSum != magicNum | diag1Sum != magicNum | diag2Sum != magicNum) return;

        // check if magic for the other rows/cols
        for (int i = 1; i < size; i++) {
            colSum = 0;
            rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += resultArray.get(i).get(j);
                colSum += resultArray.get(j).get(i);

                if (rowSum > magicNum || colSum > magicNum) magic = false;
                if (!magic) break;
            }
            if (rowSum != magicNum || colSum != magicNum) magic = false;
            if (!magic) break;
        }

        if (magic) System.out.println("res: " + resultArray + " MAGIC NUM: " + magicNum);
    }

    public static void findMagicSquares(int size) {
        List<Integer> nums = new ArrayList<>();
        IntStream.range(1, size * size + 1).forEach(nums::add);
        heapPermutation(nums, nums.size(), MagicSquareTest::checkMagic);
    }

    public static void main(String[] args) {

        findMagicSquares(4);

    }
}
