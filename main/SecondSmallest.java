public class SecondSmallest {
    private static int findSecondSmallest(int[] testArray) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int j : testArray) {
            if (j < min) {
                secondMin = min;
                min = j;
            }
//            } else if (j < secondMin) {
//                secondMin = j;
//            }
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
        Utils.assertEquals(res2, Integer.MAX_VALUE);

        int[] testArray3 = new int[]{0, 1, 2, -1, 5};

        int res3 = findSecondSmallest(testArray3);
        Utils.assertEquals(res3, 0);

        int[] testArray4 = new int[]{5, 5};

        int res4 = findSecondSmallest(testArray4);
        Utils.assertEquals(res4, 5);
    }

}
