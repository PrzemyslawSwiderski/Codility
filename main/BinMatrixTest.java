public class BinMatrixTest {

    public static void main(String[] args) {

        BinMatrix binMatrix = new BinMatrix();

        // Test Case 1.
        int ans1 = binMatrix.solution(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}});
        assert ans1 == 3;
        System.out.println("Test case 1. result: " + ans1);

        // Test Case 2.
        int ans2 = binMatrix.solution(new int[][]{{0, 1}, {1, 0}});
        assert ans2 == 2;
        System.out.println("Test case 2. result: " + ans2);
    }

}
