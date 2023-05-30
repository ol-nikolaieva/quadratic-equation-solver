package o.nikolaieva;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] resolve() {

        double discriminant = b * b - 4 * a * c;
        double[] roots;
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            roots = new double[]{x1, x2};
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            roots = new double[]{x};
        } else {
            roots = new double[0];
        }
        return roots;
    }
}

