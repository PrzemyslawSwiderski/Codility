public class SquareInts {

    public static void main(String[] args) {

        System.out.println(squares(24, 49));
    }

    // should return an integer representing the number of square integers in the inclusive range from a to b.
    private static int squares(int a, int b) {
        int r1 = (int) Math.ceil(Math.sqrt(a));
        int r2 = (int) Math.sqrt(b);

        return r2 - r1 + 1;
    }


}
