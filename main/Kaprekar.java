public class Kaprekar {

    public static void kaprekarNumbers(int p, int q) {
        // Write your code here
        var kaprekarFound = false;
        for (int i = p; i <= q; i++) {
            if (isKaprekar(i)) {
                kaprekarFound = true;
                System.out.print(i);
                System.out.print(" ");
            }
        }
        if (!kaprekarFound) {
            System.out.println("INVALID RANGE");
        }
    }

    private static boolean isKaprekar(int num) {
        long square = (long) Math.pow(num, 2);
        String numAsString = String.valueOf(square);
        int pivot = numAsString.length() / 2;

        String left = numAsString.substring(0, pivot);
        long leftNum = left.isEmpty() ? 0 : Long.parseLong(left);
        String right = numAsString.substring(pivot);
        long rightNum = right.isEmpty() ? 0 : Long.parseLong(right);
        return leftNum + rightNum == num;
    }

    public static void main(String[] args) {

        kaprekarNumbers(0, 2224);

    }
}