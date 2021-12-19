public class BubbleSort1 extends Sorter {

    @Override
    public void sort(int[] inputArray) {
        solution(inputArray);
    }

    @Override
    public String sortingName() {
        return "Bubble sort 1";
    }

    public int[] solution(int[] list) {
        for (int j = 0; j < list.length; j++) {
            for (int i = 0; i < list.length - j - 1; i++) {
                incCallsCount();
                if (list[i] > list[i + 1]) {
                    swap(list, i, i + 1);
                }
            }

        }
        return list;
    }

}
