public class DiamondTile {

    public static void filledDiamons(double xc, double yc) {
        StdDraw.setXscale(0, arg);
        StdDraw.setYscale(0, arg);
        double[] x = { 0.5, 1, 0.5, 0 };
        double[] y = { 0, 0.5, 1, 0.5 };
        for (int i = 0; i < arg; i++) {
            for (int j = 0; j < arg; j++) {
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledPolygon(x + 0.5, y + 0.5);
            }
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        filledDiamons(n);
    }
}
