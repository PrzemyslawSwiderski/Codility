import java.util.stream.Stream;

public class ListPermTest {

  public static int permuteCounter = 0;

  private static void perm(int counter) {
    permuteCounter++;
    if (counter >= 2) {
      System.out.println("permuteCounter = " + permuteCounter);
      return;
    }
    perm(counter + 1);
    perm(counter + 1);
    perm(counter + 1);

  }

  public static void main(String[] args) {
//    perm(0);

    ListPerm listPerm = new ListPerm();
    listPerm
        .solution(Stream.of(1, 2, 3).mapToInt(Integer::intValue).toArray());

  }

}
