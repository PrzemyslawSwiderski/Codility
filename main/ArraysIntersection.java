// Given a non-empty array of integers, every element appears twice except for one. Find that single one.

import java.util.*;

public class ArraysIntersection {
    static class Record {
        int nums1Count;
        int nums2Count;
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Record> map = new HashMap<>();

        for (int num : nums1) {
            if (map.containsKey(num)) {
                Record rec = map.get(num);
                rec.nums1Count++;
            } else {
                Record rec = new Record();
                rec.nums1Count++;
                map.put(num, rec);
            }
        }

        for (int num : nums2) {
            if (map.containsKey(num)) {
                Record rec = map.get(num);
                rec.nums2Count++;
            } else {
                Record rec = new Record();
                rec.nums2Count++;
                map.put(num, rec);
            }
        }
        List<Integer> output = new ArrayList<>();
        for (Integer num : map.keySet()) {
            Record rec = map.get(num);
            int maxCount = Math.min(rec.nums1Count, rec.nums2Count);
            for (int i = 0; i < maxCount; i++) {
                output.add(num);
            }
        }
        return output.stream().sorted().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arrA1 = new int[]{1, 2, 3, 3, 4, 5};
        int[] arrA2 = new int[]{3, 3, 2, 7};

        int[] intersection1 = intersect(arrA1, arrA2);
        System.out.println(Arrays.toString(intersection1)); // intersection should be a [2,3,3]

        int[] arrB1 = new int[]{1, 2, 2, 1};
        int[] arrB2 = new int[]{2, 2};

        int[] intersection2 = intersect(arrB1, arrB2);
        System.out.println(Arrays.toString(intersection2)); // intersection should be a [2,2]
    }
}
