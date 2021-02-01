public class MinMaxSumTest {

    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3, 4, 5};
//        int[] tab = new int[]{-1, 3, 2};

        miniMaxSum(tab);
    }

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long maxSum = 0;
        long minSum = 0;
        int minIndex = 0;
        int maxIndex = 0;
        boolean[] minVisited = new boolean[arr.length];
        boolean[] maxVisited = new boolean[arr.length];

        for (int i = 0; i < 4; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int a = 0; a < arr.length; a++) {
                if (!maxVisited[a] && arr[a] > max) {
                    max = arr[a];
                    maxIndex = a;
                }
                if (!minVisited[a] && arr[a] < min) {
                    min = arr[a];
                    minIndex = a;
                }
            }
            maxVisited[maxIndex] = true;
            minVisited[minIndex] = true;
            maxSum += max;
            minSum += min;
        }
        System.out.println(minSum + " " + maxSum);
    }
}
