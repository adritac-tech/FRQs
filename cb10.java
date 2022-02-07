public class cb10 {
    private static String fraction;

    public static int gcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return gcf(b, a%b);
        }
    }

    public static String reduceFraction(int numerator, int denominator) {
        int gcf = gcf(numerator, denominator);
        if (numerator%denominator == 0) {
            int frac = numerator/denominator;
            fraction = String.valueOf(frac);
        } else {
            int num = numerator / gcf;
            int den = denominator / gcf;
            fraction = num + "/" + den;
        }
        return fraction;
    }

    
}
