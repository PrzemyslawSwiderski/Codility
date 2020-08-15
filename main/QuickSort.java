import java.util.Arrays;

public class QuickSort {

    private static void setMiddleAsBeginPivot(int[] inputArray, int begin, int end) {
        int middle = begin + (end - begin) / 2;
        int tmp = inputArray[middle];
        inputArray[middle] = inputArray[begin];
        inputArray[begin] = tmp;
    }

    private static int partition(int[] inputArray, int begin, int end) {
        setMiddleAsBeginPivot(inputArray, begin, end);
        int pivot = inputArray[begin];
        int lastLessIndex = begin;
        for (int i = begin + 1; i < end; i++) {
            if (pivot > inputArray[i]) {
                int tmp = inputArray[i];
                inputArray[i] = inputArray[lastLessIndex + 1];
                inputArray[lastLessIndex + 1] = tmp;
                lastLessIndex++;
            }
        }

        int tmp = inputArray[lastLessIndex];
        inputArray[lastLessIndex] = inputArray[begin];
        inputArray[begin] = tmp;

        return lastLessIndex + 1;
    }

    private static int[] sort(int[] inputArray) {
        quickSort(inputArray, 0, inputArray.length - 1);
        return inputArray;
    }

    private static void quickSort(int[] inputArray, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(inputArray, begin, end);
            quickSort(inputArray, begin, partitionIndex - 1);
            quickSort(inputArray, partitionIndex, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 1, 5, 1, 6, 7};

        int[] res = sort(arr);
        System.out.println(Arrays.toString(res));
    }
}
