public class ThirdSmallest {
    private static int thirdSmallest(int[] arr1) {
        int minVal = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < minVal) {
                third = second;
                second = minVal;
                minVal = arr1[i];
            } else if (arr1[i] < second) {
                second = arr1[i];
            } else if (arr1[i] < third) {
                third = arr1[i];
            }
        }

        return third;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 4, 0, 6, 7};

        int thirdSmallest1 = thirdSmallest(arr1);
        System.out.println(thirdSmallest1);

        int[] arr2 = new int[]{6, 4, 1, 1, 0};

        int thirdSmallest2 = thirdSmallest(arr2);
        System.out.println(thirdSmallest2);
    }
}
