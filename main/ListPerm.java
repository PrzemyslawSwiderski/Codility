public class ListPerm {

    public static int permuteCounter = 0;

    public void solution(int[] list) {
        permute(list, 0);
    }

    private static void swap(int[] a, int k, int i) {
        int temp = a[k];
        a[k] = a[i];
        a[i] = temp;
    }

    private static void permute(int[] a, int k) {
        if (k >= a.length) {
            permuteCounter++;
            System.out.println("______________ " + permuteCounter);
            for (int value : a) {
                System.out.print(" [" + value + "] ");
            }
            System.out.println(" k=" + k);
            return;
        }
        for (int i = k; i < a.length; i++) {
            swap(a, k, i);

            permute(a, k + 1);

            // swap back
            swap(a, k, i);
        }
    }

}
