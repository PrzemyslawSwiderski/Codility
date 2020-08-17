public class GenomicRange {

    public int[] solution(String S, int[] P, int[] Q) {
        int[][] genoms = new int[3][S.length() + 1];
        short a, c, g;
        for (int i = 0; i < S.length(); i++) {
            a = 0;
            c = 0;
            g = 0;
            if ('A' == (S.charAt(i))) {
                a = 1;
            }
            if ('C' == (S.charAt(i))) {
                c = 1;
            }
            if ('G' == (S.charAt(i))) {
                g = 1;
            }
            genoms[0][i + 1] = genoms[0][i] + a;
            genoms[1][i + 1] = genoms[1][i] + c;
            genoms[2][i + 1] = genoms[2][i] + g;
        }

        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            if (genoms[0][Q[i] + 1] - genoms[0][P[i]] > 0) {
                result[i] = 1;
                continue;
            }

            if (genoms[1][Q[i] + 1] - genoms[1][P[i]] > 0) {
                result[i] = 2;
                continue;
            }

            if (genoms[2][Q[i] + 1] - genoms[2][P[i]] > 0) {
                result[i] = 3;
                continue;

            }
            result[i] = 4;
        }

        return result;
    }

}
