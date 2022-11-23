public class Checkerboard {
    public static void main(String[] args) {
        //  Определяем размер доски
        int n = Integer.parseInt(args[0]);
        // Рисуем шахматную доску
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);

        // Общий массив для отрисовки элементов
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((i + j) % 2) == 0) StdDraw.setPenColor(StdDraw.BLACK);
                else StdDraw.setPenColor(StdDraw.RED);
                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
            }
        }
    }
}
