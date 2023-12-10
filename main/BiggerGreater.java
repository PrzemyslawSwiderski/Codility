public class BiggerGreater {


    public static String biggerIsGreater(String w) {
        // Write your code here
        char[] chars = w.toCharArray();

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

        // Are we at the last permutation already?
        if (i <= 0)
            return false;

        // Let array[i - 1] be the pivot
        // Find rightmost element greater than the pivot
        int j = array.length - 1;
        while (array[j] <= array[i - 1])
            j--;
        // Now the value array[j] will become the new pivot
        // Assertion: j >= i

        // Swap the pivot with j
        char temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        // Reverse the suffix
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        // Successfully computed the next permutation
        return true;
    }

    public static void main(String[] args) {

//        var test = "ba";
//        var test = "dcba";
        var test = "fedcbabcd";

        String result = biggerIsGreater(test);

        System.out.println("Result: " + result);

    }
}