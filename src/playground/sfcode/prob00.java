package playground.sfcode;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by aaron on 4/14/17.
 */
public class prob00 {
    public static void main(String[] args) {
        InputStream fileInputStream = prob00.class.getResourceAsStream("prob00-input");
        if(fileInputStream != null) {
            System.setIn(fileInputStream);
        }
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] data = new double[n];
        for (int i = 0; i < n; i++) {
            double d = scanner.nextDouble();
            data[i] = d;
        }
        int start = findStart(data);
//        System.err.println("start: " + start);
        double volume = 0.0;
        while (start < data.length) {
            int end = findMax(data, start);
            if (end == -1)
                break;
            volume += calcVolume(data, start, end);
            start = end;
//            System.err.println("start: " + start);
        }
        System.out.printf("%.0f", volume);
    }

    private static int findMax(double[] data, int start) {
        double max = 0;
        int maxIndex = -1;
        for (int i = start+1; i < data.length; i++) {
            if (data[i] > max && data[i-1] < data[i]) {
                max = data[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    private static int findStart(double[] data) {
        int start = data.length-1;
        for (int i = 0; i < data.length-1; i++) {
            if (data[i+1] < data[i]) {
                start = i;
                break;
            }
        }
        return start;
    }

    private static double calcVolume(double[] data, int start, int end) {
        double height = Math.min(data[start], data[end]);
        double v = 0;
        for (int i = start + 1; i < end; i++) {
            if (height-data[i] > 0) {
                v += height-data[i];
            }
        }
        return v;
    }

}
