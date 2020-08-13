import java.util.ArrayList;
import java.util.List;

public class Josephus {
    public int solution(int n, int k) {
        List<Integer> prisoners = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            prisoners.add(i);
        }
        int killIdx = 0;

        while (prisoners.size() > 1) {
            killIdx = (killIdx + (k - 1)) % prisoners.size();
            System.out.println("Prisoner to Kill: " + prisoners.get(killIdx));
            prisoners.remove(killIdx);
        }

        System.out.println("Last prisoner to Kill: " + prisoners.get(0));
        return prisoners.get(0);
    }

}
