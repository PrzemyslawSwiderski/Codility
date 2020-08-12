public class ListPerm {

  public static int permuteCounter = 0;
  public static int permuteCounter2 = 0;

  public void solution(int[] list) {
    permute(list, 0);

  }

  private static void swapForward(int[] a, int k, int i) {
    int temp = a[k];
    a[k] = a[i];
    a[i] = temp;
  }

  private static void swapBackward(int[] a, int k, int i) {
    int temp = a[k];
    a[k] = a[i];
    a[i] = temp;
  }

  private static void permute(int[] a, int k) {
    permuteCounter++;
    if (k == a.length - 1) {
      permuteCounter2++;
      System.out.println("______________ " + permuteCounter2);
      System.out.println("permuteCounter= " + permuteCounter);
      for (int i = 0; i < a.length; i++) {
        System.out.print(" [" + a[i] + "] ");
      }
      System.out.println(" k=" + k);
    } else {
      for (int i = k; i < a.length; i++) {
        swapForward(a, k, i);

        permute(a, k + 1);

        swapBackward(a, k, i);
      }
    }
  }

}
