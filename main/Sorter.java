public abstract class Sorter {

    private int callsCount = 0;
    private int swapCount = 0;

    abstract void sort(int[] inputArray);

    void incCallsCount() {
        callsCount++;
    }

    void reset() {
        callsCount = 0;
        swapCount = 0;
    }

    int getCallsCount() {
        return callsCount;
    }

    int getSwapCount() {
        return swapCount;
    }

    abstract String sortingName();

    void swap(int[] inputArray, int aIdx, int bIdx) {
        swapCount++;
        if (aIdx == bIdx) return;
        inputArray[aIdx] ^= inputArray[bIdx];
        inputArray[bIdx] ^= inputArray[aIdx];
        inputArray[aIdx] ^= inputArray[bIdx];
    }

}
