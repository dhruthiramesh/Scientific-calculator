import AdvCalc.*;

public class Calc {
    public static final String APP_VERSION = "v1.0";

    public static void main(String[] args) {
        System.out.println("=== Scientific Calculator " + APP_VERSION + " ===");

        // Test Trigonometry
        System.out.println("Sin(30°) = " + Trigonometry.sin(30));
        System.out.println("Using package constant PI: " + Trigonometry.PI);

        // Test Matrix Operations
        int[][] m1 = {{1, 2}, {3, 4}};
        int[][] m2 = {{5, 6}, {7, 8}};
        int[][] sum = Matrix.add(m1, m2);
        System.out.println("Matrix Addition [0][0]: " + sum[0][0]);

        // Test Equations
        Equations.solveQuadratic(1, -3, 2);
    }
}
