// Implementation from Cracking Coding Interview book
public class MergeSorter implements Sorter {
    private int counter = 0;

    void mergesort(int[] array, int[] helper, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergesort(array, helper, low, middle); // Sort left half
            mergesort(array, helper, middle + 1, high); // Sort right half
            merge(array, helper, low, middle, high); // Merge them
        }
    }

    void merge(int[] array, int[] helper, int low, int middle, int high) {
        // Copy both halves into a helper array
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        // Iterate through helper array. Compare the left and right half, copying back
        // the smaller element from the two halves into the original array.
        while (helperLeft <= middle && helperRight <= high) {
            counter++;
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else { // If right element is smaller than left element
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        // Copy the rest of the left side of the array into the target array
        int remaining = middle - helperLeft;

        for (int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }

    @Override
    public void sort(int[] inputArray) {
        int[] helper = new int[inputArray.length];
        mergesort(inputArray, helper, 0, inputArray.length - 1);
    }

    @Override
    public int getCompareCount() {
        return counter;
    }

    @Override
    public String sortingName() {
        return "Merge sort";
    }
}
