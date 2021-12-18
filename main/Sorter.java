public interface Sorter {

    void sort(int[] inputArray);

    int getCompareCount();

    String sortingName();

    default void swap(int[] inputArray, int aIdx, int bIdx) {
        if (aIdx == bIdx) return;
        inputArray[aIdx] ^= inputArray[bIdx];
        inputArray[bIdx] ^= inputArray[aIdx];
        inputArray[aIdx] ^= inputArray[bIdx];
    }

}
