public class FrogJmp {

  public int solution(int X, int Y, int D) {
    int num = (int) Math.ceil(Math.abs(X - Y) / (double) D);

    return num;
  }

}
