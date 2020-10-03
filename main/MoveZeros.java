// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

import java.util.Arrays;

public class MoveZeros {
    private static void moveZeros(int[] arr1) {
        int zi = 0;
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (arr1[i] == 0) {
                for (int j = i; i < arr1.length - 1 - zi; i++) {
                    int tmp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = tmp;
                }
                zi += 1;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 0, 3, 13};

        moveZeros(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{1, 0, 2, 0};

        moveZeros(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
