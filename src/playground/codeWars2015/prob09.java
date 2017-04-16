package playground.codeWars2015;

import java.io.InputStream;
import java.util.*;

/**
 * Created by aaron on 4/8/17.
 */
public class prob09 {
    public static void main(String[] args) {
        InputStream inputStream = prob09.class.getResourceAsStream("prob09-input.txt");
        if (inputStream != null)
            System.setIn(inputStream);

        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> teamscore= new HashMap<>();
        while (scanner.hasNext()) {
            int teamid = scanner.nextInt();
            int score = scanner.nextInt();
            if (teamid == 0 && score == 0)
                break;
            if (teamscore.containsKey(teamid)) {
                teamscore.put(teamid, teamscore.get(teamid)+score);
            }
            else {
                teamscore.put(teamid, score);
            }
        }
        List<Map.Entry<Integer, Integer>> teams = new ArrayList<>(teamscore.entrySet());
//        Collections.sort(teams, new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> t1, Map.Entry<Integer, Integer> t2) {
//                if (t1.getValue() == t2.getValue())
//                    return 0;
//                else
//                    return (t1.getValue()-t2.getValue())/Math.abs(t1.getValue()-t2.getValue());
//            }
//        });
        Collections.sort(teams, (t1, t2) -> t1.getValue()-t2.getValue());
//        for (int i = 1; i <= 5; i++) {
////            int index = teams.size() - i;
//            int index = i - 1;
//            System.out.printf("%d %d %d\n", i, teams.get(index).getKey(), teams.get(index).getValue());
//        }
        Set<Integer> s = new HashSet<>();
        for (int i = 1; i <= teams.size(); i++) {
            int index = teams.size() - i;
            int score = teams.get(index).getValue();
            s.add(score);
            if (s.size() > 5)
                break;
            System.out.printf("%d %d %d\n", i, teams.get(index).getKey(), teams.get(index).getValue());

        }
    }
}
