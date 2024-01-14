import java.util.Arrays;

import static java.lang.System.out;


// Lists all following permutations in the increasing lexicographical order
public class BiggerSmaller {


    public static void biggerIsSmaller(String w) {
        // Write your code here
        char[] chars = w.toCharArray();
        int iters = 1;

        do {
            out.println("----------------------------------");
            out.println("Iteration: " + iters);
            out.println("INIT: " + Arrays.toString(chars));
            iters++;
        } while (nextPermutation(chars));

    }

    // https://www.nayuki.io/page/next-lexicographical-permutation-algorithm increasing order
    private static boolean nextPermutation(char[] array) {
        var i = array.length - 1;

        // find the longest increasing sequence
        while (i >= 1 && array[i - 1] < array[i]) {
            i--;
        }

        // all is already in increasing order
        if (i <= 0)
            return false;

        // set pivot to a pre-sequence elem
        var pivot = i - 1;

        // find first rightmost smaller than pivot element in sequence
        var j = array.length - 1;
        while (array[pivot] < array[j]) {
            j--;
        }

        // swap j and pivot
        var tmp = array[pivot];
        array[pivot] = array[j];
        array[j] = tmp;

        // reverse the sequence
        var end = array.length - 1;
        var start = i;
        while (start < end) {
            var tmp2 = array[start];
            array[start] = array[end];
            array[end] = tmp2;
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

//        var test = "dcba";
        var test = "cdbaf";

        biggerIsSmaller(test);

    }
}