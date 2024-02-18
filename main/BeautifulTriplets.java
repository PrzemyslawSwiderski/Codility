// Given a non-empty array of integers, every element appears twice except for one. Find that single one.

import java.util.List;

public class BeautifulTriplets {

    private static int findTriplets(int d, List<Integer> arr) {
        var count = 0;

        for (int i = 0; i < arr.size(); i++) {

            var current = arr.get(i);

            for (int j = i + 1; j < arr.size(); j++) {

                if (arr.get(j) - current == d) {

                    for (int k = j + 1; k < arr.size(); k++) {
                        if (arr.get(k) - arr.get(j) == d) {
                            count++;
                            break;
                        }
                    }

                }
            }

        }

        return count;
    }

    public static void main(String[] args) {
        var list = List.of(1, 2, 4, 5, 7, 8, 10);
        var d = 3;

        int count = findTriplets(d, list);
        System.out.println(count);
    }
}
