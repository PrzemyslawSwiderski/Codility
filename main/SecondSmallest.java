public class SecondSmallest {
    private static int findSecondSmallest(int[] testArray) {
        if (testArray.length < 2) return -1;
        int min = Integer.MAX_VALUE;
        int secondMin = min;

        for (int value : testArray) {
            if (value < min) {
                secondMin = min;
                min = value;
            } else if (value < secondMin) {
                secondMin = value;
            }
        }

        return secondMin;
    }

    public static void main(String[] args) {

        int[] testArray1 = new int[]{0, 2};

        int res1 = findSecondSmallest(testArray1);
        Utils.assertEquals(res1, 2);
        System.out.println("Second smallest value in testArray1: " + res1);

        int[] testArray2 = new int[]{0};

        int res2 = findSecondSmallest(testArray2);
        Utils.assertEquals(res2, -1);

        int[] testArray3 = new int[]{0,1,2,-1,5};

        int res3 = findSecondSmallest(testArray3);
        Utils.assertEquals(res3, 0);
    }

}
