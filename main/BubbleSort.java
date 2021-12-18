public class BubbleSort implements Sorter {

    int compareCount = 0;

    @Override
    public void sort(int[] inputArray) {
        solution(inputArray);
    }

    @Override
    public int getCompareCount() {
        return compareCount;
    }

    @Override
    public String sortingName() {
        return "Bubble sort";
    }

    public int[] solution(int[] list) {
        for (int j = 0; j < list.length; j++) {
            for (int i = 0; i < list.length - j - 1; i++) {
                compareCount++;
                if (list[i] > list[i + 1]) {
                    swap(list, i, i + 1);
                }
            }

        }
        return list;
    }

}
