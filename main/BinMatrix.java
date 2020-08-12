import java.util.LinkedList;
import java.util.Queue;

public class BinMatrix {
    private final int[][] dirs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, -1}, {-1, 1}, {-1, -1}, {1, 1}};

    private int bfs(int[][] grid) {
        int N = grid.length;

        Queue<int[]> queue = new LinkedList<>();
        grid[0][0] = 1;

        queue.add(new int[]{0, 0});

        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.remove();
                if (curr[0] == N - 1 && curr[1] == N - 1) return ans + 1;

                for (int[] dir : dirs) {
                    int nextX = dir[0] + curr[0];
                    int nextY = dir[1] + curr[1];
                    if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N && grid[nextX][nextY] == 0) {
                        queue.add(new int[]{nextX, nextY});
                        grid[nextX][nextY] = 1;
                    }
                }
            }
            ans++;
        }

        return -1;
    }

    public int solution(int[][] grid) {

        int N = grid.length;
        if (grid[0][0] == 1 || grid[N - 1][N - 1] == 1) return -1;

        return bfs(grid);
    }
}
