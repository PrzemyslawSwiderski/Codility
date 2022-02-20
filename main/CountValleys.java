import java.util.Map;

public class CountValleys {

    public static void main(String[] args) {

        System.out.println(countingValleys("UDDDUDUU"));
    }

    // should return an integer representing the number of square integers in the inclusive range from a to b.
    private static int countingValleys(String path) {
        char[] ch = path.toCharArray();
        int counter = 0;
        int height = 0;
        for (char c : ch) {

            if (c == 'U') {
                height++;
            }

            if (c == 'D') {
                height--;
            }

            if (c == 'U' && height == 0) {
                counter++;
            }
        }
        return counter;
    }


}
