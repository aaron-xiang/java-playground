package playground.codeWars2015;

import java.io.InputStream;
import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by aaron on 4/20/17.
 */
public class prob12 {
    public static void main(String[] args) {
        InputStream inputstream = prob12.class.getResourceAsStream("prob12-input.txt");
        if (inputstream != null) {
            System.setIn(inputstream);
        }
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double max = 0;
        double[][] grid = new double[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                double d = scanner.nextDouble();
                grid[i][j] = d;
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                double m = findMax(i, j, grid);
                if ( m > max)
                    max = m;

            }
        }
        System.out.printf("Max angle is %.2f degrees", atan(max)*180/PI);
    }

    private static double findMax(int i, int j, double[][] grid) {
        double max = 0;
        if (i != grid.length-1) {
            if (j == 0 ) {
                double[] r = new double[3];
                r[0] = abs(grid[i][j] - grid[i + 1][j]);
                r[1] = abs(grid[i][j] - grid[i + 1][j + 1]) / sqrt(2);
                r[2] = abs(grid[i][j] - grid[i][j + 1]);
                for (int k = 0; k < r.length; k++) {
                    if (r[k] > max)
                        max = r[k];
                }
            } else if (j == grid.length - 1) {
                double[] r = new double[2];
                r[0] = abs(grid[i][j] - grid[i + 1][j - 1]) / sqrt(2);
                r[1] = abs(grid[i][j] - grid[i + 1][j]);
                for (int k = 0; k < r.length; k++) {
                    if (r[k] > max)
                        max = r[k];
                }
            } else {
                double[] r = new double[4];
                r[0] = abs(grid[i][j] - grid[i + 1][j - 1]) / sqrt(2);
                r[1] = abs(grid[i][j] - grid[i + 1][j]);
                r[2] = abs(grid[i][j] - grid[i + 1][j + 1]) / sqrt(2);
                r[3] = abs(grid[i][j] - grid[i][j + 1]);
                for (int k = 0; k < r.length; k++) {
                    if (r[k] > max)
                        max = r[k];
                }
            }
        }
        else {
            for (int k = 0; k < grid.length-1; k++) {
                if (abs(grid[i][k] - grid[i][k+1]) > max) {
                    max = abs(grid[i][k] - grid[i][k+1]);
                }
            }

        }
        return max;
    }

}