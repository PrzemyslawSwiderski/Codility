public class QuickSorter1 extends Sorter {

    private int partition(int[] inputArray, int begin, int end) {
        int pivot = inputArray[begin];
        int lastLessIndex = begin;
        for (int i = begin + 1; i <= end; i++) {
            incCallsCount();
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

    public void sort(int[] inputArray) {
        quickSort(inputArray, 0, inputArray.length - 1);
    }

    @Override
    public String sortingName() {
        return "Quick sort 1";
    }


}
