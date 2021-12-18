// Implementation from Cracking Coding Interview book
public class QuickSorter2 implements Sorter {

    private int compareCount = 0;

    public void sort(int[] inputArray) {
        quickSort(inputArray, 0, inputArray.length - 1);
    }

    @Override
    public int getCompareCount() {
        return compareCount;
    }

    @Override
    public String sortingName() {
        return "Quick sort 2";
    }


    void quickSort(int[] arr, int left, int right) {
        int index = partitionAlt(arr, left, right);
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
            while (arr[left] < pivot) {
                compareCount++;
                left++;
            }

            while (arr[right] > pivot) {
                compareCount++;
                right--;
            }

            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

}
