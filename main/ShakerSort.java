public class ShakerSort extends Sorter {

    @Override
    public void sort(int[] list) {
        int left = 1, right = list.length - 1, k = list.length - 1;

        do {
            for (int i = right; i >= left; i--) {
                incCallsCount();
                if (list[i - 1] > list[i]) {
                    swap(list, i - 1, i);
                    k = i;
                }
            }
            left = k + 1;
            for (int i = left; i <= right; i++) {
                incCallsCount();
                if (list[i - 1] > list[i]) {
                    swap(list, i - 1, i);
                    k = i;
                }
            }
            right = k - 1;
        } while (left <= right);
    }

    @Override
    public String sortingName() {
        return "Shaker sort";
    }


}
