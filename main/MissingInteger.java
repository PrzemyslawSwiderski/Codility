import java.util.HashSet;

class MissingInteger {

    public int solution(int[] A) {
        int num = 1;
        HashSet<Integer> hashset = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            hashset.add(A[i]);

            while (hashset.contains(num)) {
                num++;
            }
        }

        return num;
    }
}