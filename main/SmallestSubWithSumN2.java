// O(n^2) solution for finding smallest subarray with sum
// greater than x
public class SmallestSubWithSumN2 {

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

    private static int smallestSubWithSum(int[] arr, int x) {
        int minLength = arr.length + 1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            if (arr[i] > 0)
                sum = arr[i];
            if (sum > x)
                return 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > 0)
                    sum += arr[j];
                int currentLength = (j - i + 1);
                if (sum >= x && currentLength < minLength)
                    minLength = currentLength;
            }
        }

        if (minLength > arr.length)
            throw new IllegalArgumentException("Not Possible");
        return minLength;
    }
}
