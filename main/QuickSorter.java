public class QuickSorter implements Sorter {

    private int compareCount = 0;

    private int partition(int[] inputArray, int begin, int end) {
        int pivot = inputArray[begin];
        int lastLessIndex = begin;
        for (int i = begin + 1; i <= end; i++) {
            compareCount++;
            if (pivot > inputArray[i]) {
                lastLessIndex++;
                swap(inputArray, i, lastLessIndex);
            }
        }
        swap(inputArray, begin, lastLessIndex);

        return lastLessIndex + 1;
    }

    private void quickSort(int[] inputArray, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(inputArray, begin, end);
            quickSort(inputArray, begin, partitionIndex - 1);
            quickSort(inputArray, partitionIndex, end);
        }
    }


    private void quickSort3(int[] ints, int startIdx, int endIdx) {
        if (startIdx >= endIdx) return;

        int pivot = ints[startIdx];
        int lessIdx = startIdx;

        for (int i = startIdx + 1; i <= endIdx; i++) {
            compareCount++;
            if (ints[i] < pivot) {
                lessIdx++;
                swap(ints, lessIdx, i);
            }
        }
        swap(ints, startIdx, lessIdx);

        quickSort3(ints, startIdx, lessIdx - 1);
        quickSort3(ints, lessIdx + 1, endIdx);
    }

    public void sort(int[] inputArray) {
//        quickSort(inputArray, 0, inputArray.length - 1);
//        quickSortAlt(inputArray, 0, inputArray.length - 1);
        quickSort3(inputArray, 0, inputArray.length - 1);
    }

    @Override
    public int getCompareCount() {
        return compareCount;
    }

    @Override
    public String sortingName() {
        return "Quick sort";
    }


    void quickSortAlt(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quickSort(arr, left, index - 1);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }
    }

    int partitionAlt(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];
        while (left <= right) {
            while (arr[left] < pivot) left++;

            while (arr[right] > pivot) right--;

            compareCount++;
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

}
