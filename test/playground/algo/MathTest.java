package playground.algo;

import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by henry on 11/2/16.
 */
public class MathTest {
    @Test
    public void testLeastCommonMultiple() throws Exception {
        InputStream inputStream = this.getClass().getResourceAsStream("MathTest2.txt");
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = scanner.nextInt();
            Assert.assertEquals("Wrong result", result, Math.leastCommonMultiple(a, b));
        }
        scanner.close();
    }

    @Test
    public void testGreatestCommonDivisor() throws Exception {
        InputStream inputStream = this.getClass().getResourceAsStream("MathTest1.txt");
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = scanner.nextInt();
            Assert.assertEquals("Wrong result", result, Math.greatestCommonDivisor(a, b));
        }
        scanner.close();
    }
}