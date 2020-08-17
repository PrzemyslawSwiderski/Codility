public class Utils {

    public static void assertEquals(int actual, int expected) {
        if (actual != expected) throw new AssertionError("Value: " + actual + " is not as expected: " + expected);
    }
}
