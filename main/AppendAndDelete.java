public class AppendAndDelete {

    public static void main(String[] args) {

        String ts1 = "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv";
        String ts2 = "bsdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv";
        int n = 100;
//        String ts1 = "aaaaaaaaaa";
//        String ts2 = "aaaaa";
//        int n = 7;

        String result = calcOperations(ts1, ts2, n);
        System.out.println(result);
    }

    private static String calcOperations(String s, String t, int k) {

        if (s.equals(t)) return "Yes";

        int minSteps = 0;

        int sameChars = 0;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        while (sameChars < sChars.length && sameChars < tChars.length && sChars[sameChars] == tChars[sameChars]) {
            sameChars++;
        }

        minSteps += sChars.length - sameChars;
        minSteps += tChars.length - sameChars;

        if (minSteps == k)
            return "Yes";
        else if (minSteps > k) return "No";
        else if ((k - minSteps) % 2 == 0)
            return "Yes";
        else if (k - minSteps >= sameChars * 2) {
            return "Yes";
        } else
            return "No";
    }


}
