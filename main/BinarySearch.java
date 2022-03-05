public class BinarySearch {

    private static int RECURSION_COUNTER = 0;

    private static int binarySearchRecursive(int[] testArray, int element, int leftIdx, int rightIdx) {
        RECURSION_COUNTER++;
        if (leftIdx > rightIdx) {
            System.out.println("Recursion calls: " + RECURSION_COUNTER);
            return -1;
        }

        int midIdx = (rightIdx - leftIdx) / 2 + leftIdx;
        int mid = testArray[midIdx];

        if (mid < element) {
            return binarySearchRecursive(testArray, element, midIdx, rightIdx);
        } else if (mid > element) {
            return binarySearchRecursive(testArray, element, leftIdx, midIdx);
        } else {
            System.out.println("Recursion calls: " + RECURSION_COUNTER);
            return midIdx;
        }
    }

    private static int binarySearch(int[] testArray, int element) {
        int idx = -1;

        int leftIdx = 0, rightIdx = testArray.length;

        int iterations = 0;
        while (leftIdx < rightIdx) {
            iterations++;
            int midIdx = (rightIdx - leftIdx) / 2 + leftIdx;
            int mid = testArray[midIdx];

            if (mid < element) {
                leftIdx = midIdx;
            } else if (mid > element) {
                rightIdx = midIdx;
            } else {
                idx = midIdx;
                break;
            }

        }
        System.out.println("Iterations count: " + iterations);
        return idx;
    }

    public static void main(String[] args) {

        int[] testArray1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int element = 9;
        int res1 = binarySearch(testArray1, element);
        System.out.println("Element idx is: " + res1);

        res1 = binarySearchRecursive(testArray1, element, 0, testArray1.length);
        System.out.println("Element idx found by recursion is: " + res1);
    }
}
