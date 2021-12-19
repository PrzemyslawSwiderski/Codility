public class BubbleSort2 extends Sorter {

    @Override
    public void sort(int[] inputArray) {
        solution(inputArray);
    }

    @Override
    public String sortingName() {
        return "Bubble sort 2";
    }

    public int[] solution(int[] list) {
        for (int j = 1; j < list.length; j++) {
            for (int i = list.length - 1; i >= j; i--) {
                incCallsCount();
                if (list[i] < list[i - 1]) {
                    swap(list, i, i - 1);
                }
            }

        }
        return list;
    }

}
