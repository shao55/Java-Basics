public class PlotFunctionEx {
    public static void main(String[] args) {
        /* Рисуем N отрезков в зависимости от расчетной формулы */
        int N = Integer.parseInt(args[0]);
        // Массив N + 1, т.к. для рисования 1 отрезка нужны 2 точки, для 10 отрезков - 11 точек, для N отрезков - N + 1 точек.
        // Массивы для точки по оси X и по оси Y.
        double[] x = new double[N + 1];
        double[] y = new double[N + 1];
        // Находим точки по координатам X и Y, и кладём их в массив
        // Счетчик цикла for <= N. для того чтобы найти N + 1 точки. Массив от 0 до N - 11 точек.
        for (int i = 0; i <= N; i++) {
            // Находим точки по формуле.
            x[i] = Math.PI * i / N;
            y[i] = Math.sin(4 * x[i]) + Math.sin(20 * x[i]);
            // System.out.println("(" + x[i] + ", " + y[i] + ")");
        }
        // Обозначаем границы для отображения
        // Метод setXscale(double min, double max)
        StdDraw.setXscale(0, Math.PI);
        StdDraw.setYscale(-2.0, +2.0);

        for (int i = 0; i < N; i++)
            // Рисуем линии методом .line
            // StdDraw.line(double x0,double y0,double x1,double y1)
            // Draw a line from (x0, y0) to (x1, y1)
            StdDraw.line(x[i], y[i], x[i + 1], y[i + 1]);
    }
}
