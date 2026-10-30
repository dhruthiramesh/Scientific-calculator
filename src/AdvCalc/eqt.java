package AdvCalc;

public class eqt {

    // Solves ax + b = 0
    public static double solveLinear(double a, double b) {
        if (a == 0) {
            throw new IllegalArgumentException("'a' cannot be 0 in a linear equation");
        }
        return -b / a;
    }

    // Solves ax^2 + bx + c = 0, returns the real roots
    public static double[] solveQuadratic(double a, double b, double c) {
        if (a == 0) {
            return new double[] { solveLinear(b, c) };
        }
        double d = b * b - 4 * a * c;
        if (d < 0) {
            return new double[] {};
        } else if (d == 0) {
            return new double[] { -b / (2 * a) };
        }
        double sq = Math.sqrt(d);
        return new double[] { (-b + sq) / (2 * a), (-b - sq) / (2 * a) };
    }
}