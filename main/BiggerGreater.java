import java.util.Arrays;

import static java.lang.System.out;

public class BiggerGreater {


    public static String biggerIsGreater(String w) {
        // Write your code here
        char[] chars = w.toCharArray();
        int iters = 1;

        do {
            out.println("----------------------------------");
            out.println("Iteration: " + iters);
            out.println("INIT: " + Arrays.toString(chars));
            iters++;
        } while (nextPermutation(chars));

        if (nextPermutation(chars)) {
            return new String(chars);
        } else {
            return "no answer";
        }
    }

    // https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
    private static boolean nextPermutation(char[] array) {
        // Find longest non-increasing suffix
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i])
            i--;
        // Now i is the head index of the suffix
        out.println("longest non-increasing suffix head Idx: " + i + " value: " + array[i]);

        // Are we at the last permutation already?
        if (i <= 0)
            return false;

        // Let array[i - 1] be the pivot
        int pivotIdx = i - 1;
        out.println("Pivot (before head) Idx: " + pivotIdx + " value: " + array[pivotIdx]);

        // Find rightmost element greater than the pivot
        int j = array.length - 1;
        while (array[j] <= array[pivotIdx])
            j--;
        // Now the value array[j] will become the new pivot
        // Assertion: j >= i
        out.println("right most elem (greater than pivot) Idx: " + j + " value: " + array[j]);


        // Swap the pivot with j
        char temp = array[pivotIdx];
        array[pivotIdx] = array[j];
        array[j] = temp;

        out.println("AFTER rightMostElem and pivot swap: " + Arrays.toString(array));

        // Reverse the suffix
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        out.println("AFTER suffix reversing: " + Arrays.toString(array));

        // Successfully computed the next permutation
        return true;
    }

    public static void main(String[] args) {

//        var test = "ba";
//        var test = "dcba";
//        var test = "fedcbabcd";
//        var test = "abcdef";
        var test = "abcd";

        String result = biggerIsGreater(test);

        out.println("Result: " + result);

    }
}