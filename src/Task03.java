import java.util.Scanner;

/**
 * Created by aaron on 4/22/17.
 */
public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] planets = {
                "Hoth", "Jakku", "Tatooine", "Dagobah", "Kashyyyk"
        };
        int max = 0;

        for (int i = 0; i < n; i++) {
            int[] counts = new int[5];
            String votes = scanner.next();
            char[] voteArray = votes.toCharArray();
            for (int l = 0; l < voteArray.length; l++) {
                if (voteArray[l] == '0') {
                    counts[0] += 1;
                } else if (voteArray[l] == '1') {
                    counts[1] += 1;

                } else if (voteArray[l] == '2') {
                    counts[2] += 1;


                } else if (voteArray[l] == '3') {
                    counts[3] += 1;


                } else if (voteArray[l] == '4') {
                    counts[4] += 1;


                }

            }
            max = arrayMax(counts);
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < counts.length; j++) {
                if (counts[j] == max) {
                    result.append(planets[j]).append(" ");
                }
            }
            System.out.println(result.toString().trim());
        }

    }


    private static int arrayMax (int[] a) {
        int max = Integer.MIN_VALUE;
        for(int n : a) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}
