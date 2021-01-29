import java.math.BigInteger;

public class Factorials {

    public static void main(String[] args) {
        calculateExtraLongFactorial(25);
    }

    private static void calculateExtraLongFactorial(int n) {
        BigInteger factorial = BigInteger.valueOf(n);

        while (n > 1) {
            n--;
            factorial = factorial.multiply(BigInteger.valueOf(n));
        }

        System.out.println(factorial);
    }
}
