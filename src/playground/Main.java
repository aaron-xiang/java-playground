package playground;

import playground.algo.Algorithm;
import playground.algo.HanoiTower;
import playground.algo.Math;
import playground.app.Person;
import playground.app.PlayingCard;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private final static Logger logger = Logger.getLogger(Main.class.getName());

    static {
        logger.setLevel(Level.INFO);
    }

    public static void main(String[] args) {
        GuiMain.init(args);
//        DrawTest drawTest = new DrawTest();
//        drawTest.init();
    }

    private static void testGCD(int a, int b) {
        System.out.printf("%d, %d, %d\n", a, b, Math.greatestCommonDivisor(a, b));
    }
    private static void testPermutation(String input) {
        List<String> results = Algorithm.getPermutation(input);
        for (String s : results) {
            System.out.println(s);
        }
    }

    private static void testHanoiTower(int level) {
        HanoiTower hanoiTower = new HanoiTower();
        hanoiTower.solve(level, "Left", "Middle", "Right");
    }

    private static void compareStringConcat() {
        int n = 200000;
        for (int i = 10000; i <= n; i += 10000) {
            logger.info("n = " + i);
            concatString1('*', i);
            concatString2('*', i);
        }
    }

    private static void localDate() {
        LocalDate date = LocalDate.parse("2016-06-01");
        String weekDay = date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US);
        String weekDayFull = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINA);
        System.out.println("My first Java app.");
        System.out.println(date.getMonth().getDisplayName(TextStyle.FULL, Locale.CHINA) + ' ' + weekDayFull);
    }

    private static void printSeq(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    private static void test2() {
        Person person1 = new Person();
        person1.setName("Tom");
        person1.setAge(12);

        Person person2 = new Person();
        person2.setName("David");
        person2.setAge(10);

        Person person3 = person1;

        int a = 12;
        double b = 35.6;

        Integer c = 15;
        Double d = 88.8;

        String s1 = "Test";
        String s2 = "Test";

        int[] e = new int[] {1,2,3,4,5};

        System.out.println("End");
    }

    private static void test3() {
        double a = 0.1;
        boolean b = (a * 3 == 0.3);
        System.out.println("b = " + b);

        BigDecimal num1 = new BigDecimal("0.1");
        BigDecimal m = new BigDecimal("3");
        BigDecimal num2 = new BigDecimal("0.3");
        System.out.println("Is Equal: " + num1.multiply(m).equals(num2));
    }

    private static void test4() {
        int a = 1;
        int n = 0;
        int result = a / n;

        if (n == 0) {
            System.out.println("error");
        }
        else {
            System.out.println(result);
        }
    }

    private static void testPlayingCard() {
        PlayingCard c = new PlayingCard(1);
        c.shuffle();
        System.out.println(c.size());
        for (int i = 1; i <= 5; i++) {
            List<String> hand = c.draw(5);
            System.out.println("Hand " + i + ":");;
            System.out.println(hand);
            System.out.println(c.size());
        }

    }

    private static void concatString1(char c, int n) {
        String s = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            s += c;
        }
//        System.out.println(s);
        long endTime = System.currentTimeMillis();
        logger.info(String.format("Time elapse: %.3f sec", (endTime-startTime)/1000.0));
    }

    private static void concatString2(char c, int n) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sb.append(c);
        }
//        System.out.println(sb.toString());
        String s = sb.toString();
        long endTime = System.currentTimeMillis();
        logger.info(String.format("Time elapse: %.3f sec", (endTime-startTime)/1000.0));
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int factorial2(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
