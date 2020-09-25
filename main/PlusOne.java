// Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
// You may assume the integer does not contain any leading zero, except the number 0 itself.

import java.util.*;

public class PlusOne {

    private static int[] plusOne(int[] nums) {
        nums[nums.length - 1] = nums[nums.length - 1] + 1;

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > 9) {
                nums[i - 1] = nums[i - 1] + 1;
                nums[i] = 0;
            }
        }
        if (nums[0] == 10) {
            int[] ex = new int[nums.length + 1];
            ex[0] = 1;
            ex[1] = 0;
            for (int i = 1; i < nums.length; i++) {
                ex[i + 1] = nums[i];
            }
            return ex;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};

        int[] plusOne1 = plusOne(arr1);
        System.out.println(Arrays.toString(plusOne1)); // should be a [1,2,4]

        int[] arr2 = new int[]{9, 9, 9};

        int[] plusOne2 = plusOne(arr2);
        System.out.println(Arrays.toString(plusOne2)); // should be a [1,0,0,0]

        int[] arr3 = new int[]{9};

        int[] plusOne3 = plusOne(arr3);
        System.out.println(Arrays.toString(plusOne3)); // should be a [1,0]
    }
}
