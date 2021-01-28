// O(n) solution for finding smallest subarray with sum
// greater than x
public class SmallestSubWithSumN {

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 45, 6, -10, 19};
        int res1 = smallestSubWithSum(arr1, 51);
        System.out.println(res1);

        int[] arr2 = {1, -10, 5, 2, 7};
        int res2 = smallestSubWithSum(arr2, 9);
        System.out.println(res2);

        int[] arr3 = {1, 11, 100, -1, 0, -200, 3, -2, 1, 250};
        int res3 = smallestSubWithSum(arr3, 280);
        System.out.println(res3);
    }

    private static int smallestSubWithSum(int[] arr, int sum) {
        int n = arr.length;

        // ignore elements less than 0
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) arr[i] = 0;
        }

        // Initialize current sum and minimum length
        int currentSum = 0, minLength = n + 1;

        // Initialize starting and ending indexes
        int start = 0, end = 0;
        while (end < n) {
            // Keep adding array elements while current sum
            // is smaller than x
            while (currentSum < sum && end < n)
                currentSum += arr[end++];

            // If current sum becomes greater than x.
            while (currentSum >= sum && start < n) {
                // Update minimum length if needed
                if (end - start < minLength)
                    minLength = end - start;

                // remove starting elements
                currentSum -= arr[start++];
            }
        }
        if (minLength > arr.length)
            throw new IllegalArgumentException("Not Possible");

        return minLength;
    }
}
