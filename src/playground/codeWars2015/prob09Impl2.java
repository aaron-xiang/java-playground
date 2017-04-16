package playground.codeWars2015;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

/**
 * Created by aaron on 4/15/17.
 */
public class prob09Impl2 {
    public static void main(String[] args) {
        InputStream inputStream = prob09Impl2.class.getResourceAsStream("prob09-input.txt");
        if (inputStream != null)
            System.setIn(inputStream);

        Scanner scanner = new Scanner(System.in);
        Map<Integer, Team> teams = new HashMap<>();
        while (scanner.hasNext()) {
            int id = scanner.nextInt();
            int score = scanner.nextInt();
            if (id == 0 && score == 0)
                break;
            if (teams.containsKey(id)) {
                teams.get(id).score += score;
            } else {
                Team team = new Team();
                team.id = id;
                team.score = score;
                teams.put(id, team);
            }
        }

//        List<Team> t = teams.values()
//                .stream()
//                .sorted((t1, t2) -> t2.score-t1.score)
//                .limit(5)
//                .collect(Collectors.toList());
//
//        for (int i = 0; i < t.size(); i++) {
//            System.out.printf("%d %d %d%n", i+1, t.get(i).id, t.get(i).score);
//        }
        teams.values().stream()
        .filter((team) -> team.score >= 5)
        .forEach((team) -> System.out.printf("%d %d\n", team.id, team.score));
    }
}

class Team {
    int id;
    int score;
}
