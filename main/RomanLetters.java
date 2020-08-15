public class RomanLetters {

    private static final String[] literals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    private static String roman(int testNum) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (testNum >= values[i]) {
                sb.append(literals[i]);
                testNum -= values[i];
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int testNum = 549;

        String res = roman(testNum);
        System.out.println(res);
    }
}
