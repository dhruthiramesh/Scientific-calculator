
package calculator;

public class Trig {

    private static final double EPS = 1e-10;

    // ---------- conversions ----------
    public static double toRadians(double deg) { return deg * Math.PI / 180.0; }
    public static double toDegrees(double rad) { return rad * 180.0 / Math.PI; }

    // Cleans up floating-point noise like 1.2246e-16 -> 0
    private static double clean(double x) {
        double r = Math.round(x * 1e10) / 1e10;
        return (r == 0.0) ? 0.0 : r;   // avoids printing -0.0
    }

    // ---------- primary functions (input in degrees) ----------
    public static double sin(double deg) { return clean(Math.sin(toRadians(deg))); }
    public static double cos(double deg) { return clean(Math.cos(toRadians(deg))); }

    public static double tan(double deg) {
        double c = Math.cos(toRadians(deg));
        if (Math.abs(c) < EPS)
            throw new ArithmeticException("tan undefined at " + deg + " degrees");
        return clean(Math.sin(toRadians(deg)) / c);
    }

    // ---------- reciprocal functions ----------
    public static double cosec(double deg) {
        double s = Math.sin(toRadians(deg));
        if (Math.abs(s) < EPS)
            throw new ArithmeticException("cosec undefined at " + deg + " degrees");
        return clean(1.0 / s);
    }

    public static double sec(double deg) {
        double c = Math.cos(toRadians(deg));
        if (Math.abs(c) < EPS)
            throw new ArithmeticException("sec undefined at " + deg + " degrees");
        return clean(1.0 / c);
    }

    public static double cot(double deg) {
        double s = Math.sin(toRadians(deg));
        if (Math.abs(s) < EPS)
            throw new ArithmeticException("cot undefined at " + deg + " degrees");
        return clean(Math.cos(toRadians(deg)) / s);
    }

    // ---------- inverse functions (output in degrees) ----------
    public static double asin(double x) {
        if (x < -1 || x > 1) throw new IllegalArgumentException("asin domain is [-1, 1]");
        return clean(toDegrees(Math.asin(x)));
    }

    public static double acos(double x) {
        if (x < -1 || x > 1) throw new IllegalArgumentException("acos domain is [-1, 1]");
        return clean(toDegrees(Math.acos(x)));
    }

    public static double atan(double x) { return clean(toDegrees(Math.atan(x))); }

    // ---------- optional extras ----------
    public static double sinh(double x) { return clean(Math.sinh(x)); }
    public static double cosh(double x) { return clean(Math.cosh(x)); }
    public static double tanh(double x) { return clean(Math.tanh(x)); }
}