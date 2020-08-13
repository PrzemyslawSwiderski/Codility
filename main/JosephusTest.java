public class JosephusTest {

    public static void main(String[] args) {

        Josephus josephus = new Josephus();

        // Test Case 1.
        int ans1 = josephus.solution(4,2);
        assert ans1 == 1;
        System.out.println("Test case 1. result: " + ans1);

    }

}
