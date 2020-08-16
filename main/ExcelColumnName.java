public class ExcelColumnName {

    private static String toExcelName(int testNum) {
        StringBuilder sb = new StringBuilder();

        while (testNum > 0) {
            int rem = testNum % 26;
            if (rem == 0) {
                sb.append("Z");
                testNum = (testNum / 26) - 1;
            } else {
                sb.append((char) (rem + 'A' - 1));
                testNum = testNum / 26;
            }
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int test1 = 2;

        String res1 = toExcelName(test1);
        System.out.println(res1);

        int test2 = 26;

        String res2 = toExcelName(test2);
        System.out.println(res2);

        int test3 = 705;

        String res3 = toExcelName(test3);
        System.out.println(res3);
    }
}
