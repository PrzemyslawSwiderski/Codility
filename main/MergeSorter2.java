public class MergeSorter2 extends Sorter {


    private void mergesort(int[] inputArray, int start, int end) {
        if (start >= end) return;

        int mid = (start + end) / 2;
        mergesort(inputArray, start, mid);
        mergesort(inputArray, mid + 1, end);
        merge(inputArray, start, end);
    }

    private void merge(int[] inputArray, int start, int end) {
        int[] tmp = new int[inputArray.length];

        // copy input array to a tmp one
        System.arraycopy(inputArray, start, tmp, start, end - start + 1);

        int mid = ((start + end) / 2) + 1;
        int leftIdx = start;
        int rightIdx = mid;

        for (int i = start; i <= end; i++) {
            if (leftIdx > mid - 1) {
                // copy all elements from right half
                while (rightIdx < end) {
                    inputArray[i] = tmp[rightIdx];
                    i++;
                    rightIdx++;
                }
                break;
            }

            if (rightIdx > end) {
                // copy all elements from left half
                while (leftIdx < mid) {
                    inputArray[i] = tmp[leftIdx];
                    i++;
                    leftIdx++;
                }
                break;
            }

            if (tmp[rightIdx] < tmp[leftIdx]) {
                inputArray[i] = tmp[rightIdx];
                rightIdx++;
            } else {
                inputArray[i] = tmp[leftIdx];
                leftIdx++;
            }

        }

    }

    @Override
    public void sort(int[] inputArray) {
        mergesort(inputArray, 0, inputArray.length - 1);
    }

    @Override
    public String sortingName() {
        return "Merge sort 2";
    }
}
