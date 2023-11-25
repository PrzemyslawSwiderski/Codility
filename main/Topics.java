import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
        var teamsNum = topic.size();
        var matchesList = new ArrayList<Integer>();

        var maxMatches = 0;
        var permCount = 0;
        for (var i = 1; i <= teamsNum; i++) {
            for (var j = i + 1; j <= teamsNum; j++) {
                permCount++;
                System.out.println("Perm= " + permCount);
                System.out.println("i=" + i);
                System.out.println("j=" + j);
                var matches = matches(List.of(topic.get(i - 1), topic.get(j - 1)));
                matchesList.add(matches);
                if (matches >= maxMatches) {
                    maxMatches = matches;
                }
                System.out.println("matches=" + matches);
            }
        }
        int finalMaxMatches = maxMatches;
        var teamCount = matchesList.stream().filter(m -> m == finalMaxMatches).count();

        return List.of(maxMatches, Math.toIntExact(teamCount));
    }

    private static Integer matches(List<String> topics) {
        if (topics.isEmpty())
            return 0;
        var matches = 0;
        var size = topics.get(0).length();

        for (int i = 0; i < size; i++) {
            for (var t : topics) {
                if (t.charAt(i) == '1') {
                    matches++;
                    break;
                }
            }
        }

        return matches;
    }

}

public class Topics {
    public static void main(String[] args) throws IOException {
        List<String> topic = List.of(
                "10101",
                "11100",
                "11010",
                "00101"
        );

        List<Integer> result = Result.acmTeam(topic);

        System.out.println(result);
    }
}
