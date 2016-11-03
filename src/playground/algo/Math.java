package playground.algo;

public class Math {
    public static int greatestCommonDivisor(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        return greatestCommonDivisor(a, b%a);
    }

    public static int leastCommonMultiple(int a, int b) {
        return (a*b)/greatestCommonDivisor(a, b);
    }
}
