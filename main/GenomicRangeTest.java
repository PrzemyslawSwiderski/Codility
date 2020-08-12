import java.util.Arrays;

public class GenomicRangeTest {

  public static void main(String[] args) {

    GenomicRange genomicRange = new GenomicRange();

    System.out.println(
        "Solution: " + Arrays
            .toString(genomicRange.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})));


  }
}
