package AdvCalc;

public class Main {
    public static void main(String[] args) {
        // Test linear: 2x + 4 = 0  ->  x = -2
        System.out.println("Linear root: " + eqt.solveLinear(2, 4));

        // Test quadratic: x^2 - 3x + 2 = 0  ->  x = 2 and x = 1
        double[] roots = eqt.solveQuadratic(1, -3, 2);
        System.out.println("Quadratic roots:");
        for (double r : roots) {
            System.out.println(r);
        }
    }
}