import java.awt.Color;

public class Art {
    public static void circle(int n, double r, double x, double y) {
        StdDraw.setPenColor(Color.red);
        double rx = r + r;
        StdDraw.circle(x, y, rx);
    }

    public static void f(int n, double r, double x, double y) {
        if (n == 0) return; // base case

        double x0 = x - r / 2;
        double y0 = y - r / 2;
        double x1 = x + r / 2;
        double y1 = y + r / 2;
        StdDraw.line(x0, y0, x1, y1);
        StdDraw.line(x1, y0, x0, y1);

        StdDraw.setPenColor(Color.RED);
        circle(n - 1, r / 2, x, y);
        f(n - 1, r / 2, x0, y1);
        f(n - 1, r / 2, x1, y1);
        f(n - 1, r / 2, x1, y0);
        f(n - 1, r / 2, x0, y0);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        f(n, 0.5, 0.5, 0.5);
    }
}
