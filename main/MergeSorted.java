import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeSorted {

    public static void main(String[] args) {


        List<Integer> inputArray1 = List.of(1, 2, 3, 4, 6, 8, 12);
        List<Integer> inputArray2 = List.of(3, 4, 5, 6, 7);

        Set<Integer> output = new HashSet<>();
//        List<Integer> output = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < inputArray1.size() && j < inputArray2.size()) {
            if (inputArray1.get(i) < inputArray2.get(j)) {
                output.add(inputArray1.get(i));
                i++;
            } else {
                output.add(inputArray2.get(j));
                j++;
            }
        }
        while (i < inputArray1.size()) {
            output.add(inputArray1.get(i));
            i++;
        }
        while (j < inputArray2.size()) {
            output.add(inputArray2.get(j));
            j++;
        }
//        Collections.sort(output,Comparator.reverseOrder());
        List<Integer> rr = new ArrayList<>(output);
        System.out.println("Merged set: " + output);
    }

}
