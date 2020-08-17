import java.util.Arrays;

public class StringPerms {

    private void rotate(char[] chars, int k) {
        char[] outChars = new char[chars.length];
        if (k > chars.length - 1 || chars.length < 2) return;
        for (int i = 0; i < chars.length - k; i++) {
            outChars[i] = chars[k + i];
        }
        for (int i = chars.length - k; i < chars.length; i++) {
            outChars[i] = chars[chars.length - 1 - i];
        }

        System.arraycopy(outChars, 0, chars, 0, chars.length);
    }

    public void printPerms(char[] chars, char[] outChars) {
        if (chars.length == 0) {
            System.out.println(Arrays.toString(outChars));
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            rotate(chars, 1);
            char[] newOut = Arrays.copyOf(outChars, outChars.length + 1);
            newOut[newOut.length - 1] = chars[0];
            printPerms(Arrays.copyOfRange(chars, 1, chars.length), newOut);
        }
    }
}
