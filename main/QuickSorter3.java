public class QuickSorter3 extends Sorter {

    private void quickSort(int[] ints, int startIdx, int endIdx) {
        if (startIdx >= endIdx) return;
        int middleIdx = (startIdx + endIdx) / 2;
        swap(ints, startIdx, middleIdx);
        int pivot = ints[startIdx];
        int lessIdx = startIdx;

        for (int i = startIdx + 1; i <= endIdx; i++) {
            incCallsCount();
            if (ints[i] < pivot) {
                lessIdx++;
                swap(ints, lessIdx, i);
            }
        }
        swap(ints, startIdx, lessIdx);

        quickSort(ints, startIdx, lessIdx - 1);
        quickSort(ints, lessIdx + 1, endIdx);
    }

    public void sort(int[] inputArray) {
        quickSort(inputArray, 0, inputArray.length - 1);
    }

    @Override
    public String sortingName() {
        return "Quick sort 3";
    }

}
