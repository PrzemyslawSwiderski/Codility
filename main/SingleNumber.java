// Given a non-empty array of integers, every element appears twice except for one. Find that single one.

public class SingleNumber {

    private static int singleNum(int[] nums){
        int num =0;
        for(int n:nums){
            num^=n;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 1, 2, 3, 3};

        int missingNumber1 = singleNum(arr1);
        System.out.println(missingNumber1); // single num is "2"

        int[] arr2 = new int[]{1};

        int missingNumber2 = singleNum(arr2);
        System.out.println(missingNumber2); // single num is "1"

        int[] arr3 = new int[]{1, 1, 2, 2, 4, 4, 6};

        int missingNumber3 = singleNum(arr3);
        System.out.println(missingNumber3); // single num is "6"
    }
}
