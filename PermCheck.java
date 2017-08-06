// you can also use imports, for example:

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int isPermutation = 0;
            boolean[] checkList = new boolean[A.length + 1];
            int count = 0;

            for (int i = 0; i < A.length; i++)
            {
                if (A[i] > A.length)
                {
                    break;
                }

                if (!checkList[A[i]])
                {
                    checkList[A[i]] = true;
                    count += 1;
                }
            }

            if (count == A.length)
            {
                isPermutation = 1;
            }
            return isPermutation;
    }
}