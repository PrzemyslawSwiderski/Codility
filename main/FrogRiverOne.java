import java.util.HashSet;

public class FrogRiverOne {

  public int solution(int X, int[] A) {
    HashSet visitSet = new HashSet();
    for (int i = 0; i < A.length; i++) {
      visitSet.add(A[i]);

      if (visitSet.size() == X) {
        return i;
      }
    }

    return -1;
  }
}
