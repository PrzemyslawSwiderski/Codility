// Check if expression is balanced
public class IsBalanced {

    public static void main(String[] args) {

        String balanced1 = isBalanced("{(([])[])[]}");
        System.out.println(balanced1);
        String balanced2 = isBalanced("{(([])[])[]]}");
        System.out.println(balanced2);
        String balanced3 = isBalanced("{(([])[])[]}[]");
        System.out.println(balanced3);

    }

    static String isBalanced(String s) {
        if (s.length() % 2 != 0) return "NO";

        int prevLength = s.length();
        while (true) {
            s = s.replace("{}", "");
            s = s.replace("()", "");
            s = s.replace("[]", "");
            if (s.length() == prevLength) break;
            prevLength = s.length();
        }
        if (s.length() > 0) return "NO";
        return "YES";
    }
}