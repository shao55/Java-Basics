import java.awt.Color;

public class Sierpinski {
    public static void triangle(double x, double y, double s, int n) {
        if (n <= 0) {
            return;
        }
        StdDraw.setPenColor(Color.black);
        StdDraw.setPenRadius(0.002);
        double x1 = x;
        double y1 = y;
        double x2 = x1 + s;
        double y2 = y1;
        double x3 = (x1 + x2) / 2.0;
        double y3 = y1 + (Math.sqrt(3) * s / 2);
        StdDraw.line(x1, y1, x2, y2);
        StdDraw.line(x1, y1, x3, y3);
        StdDraw.line(x2, y2, x3, y3);
        triangle(x1, y1, s / 2.0, n - 1);
        triangle((x1 + x2) / 2.0, (y1 + y2) / 2.0, s / 2.0, n - 1);
        triangle((x1 + x3) / 2.0, (y1 + y3) / 2.0, s / 2.0, n - 1);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        triangle(0, 0, 1, n);
    }
}
