public class Checkerboard {
    public static void main(String[] args) {
        //  Определяем размер доски
        int n = Integer.parseInt(args[0]);
        // Рисуем шахматную доску
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);

        // Общий массив для отрисовки элементов
        // i - индекс строк
        // j - индекс столбцов
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Для четных - определяем цвет заполнения черный
                if (((i + j) % 2) == 0) StdDraw.setPenColor(StdDraw.BLACK);
                    // Либо в других случаях - красный
                else StdDraw.setPenColor(StdDraw.RED);
                // filledSquare(double x, double y, double r)
                // Draw a filled square of side length 2r, centered on (x, y).
                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
            }
        }
    }
}
