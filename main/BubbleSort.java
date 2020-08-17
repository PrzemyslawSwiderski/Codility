public class BubbleSort {

    private void swap(int[] list, int i, int j) {
        int tmp = list[i];
        list[i] = list[j];
        list[j] = tmp;
    }

    public int[] solution(int[] list) {
        int counter = 0;
        for (int j = 0; j < list.length; j++) {
            for (int i = 0; i < list.length - j - 1; i++) {
                if (list[i] > list[i + 1]) {
                    swap(list, i, i + 1);
                }
                counter++;
            }

        }
        System.out.println("counter = " + counter);
        return list;
    }

}
