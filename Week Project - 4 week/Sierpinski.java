public class Sierpinski {
    //  Высчитываем высоту равностороннего треугольника, стороны которого имеют заданную длину
    public static double height(double length) {
        double height = length * (Math.sqrt(3.0) / 2.0);
        return height;
    }

    //  Рисуем заполненный равносторонний треугольник, нижняя вершина которого равна (x, y) указанной длины стороны.
    public static void filledTriangle(double x, double y, double length) {
        double x2 = x - (length / 2);
        double y2 = y + height(length);

        double x3 = x + (length / 2);
        double y3 = y + height(length);
        // Массивы для координат
        double[] xx = { x, x2, x3 };
        double[] yy = { y, y2, y3 };
        // Рисуем треугольник, где xx - массив для x координат, yy - массив для y координат
        StdDraw.filledPolygon(xx, yy);
    }

    //  Рисуем треугольник Серпинского порядка n, такой, что наибольший
    //  треугольник имеет нижнюю вершину (x, y) и стороны заданной длины.
    public static void sierpinski(int n, double x, double y, double length) {
        if (n > 0) {
            // Рисуем основной треугольник с нижней гранью на x, y координатах
            filledTriangle(x, y, length);
            // Рисуем треугольники сверху
            sierpinski(n - 1, x, y + height(length), length / 2);
            // Рисуем треугольники слева
            sierpinski(n - 1, x - (length / 2.0), y, length / 2);
            // Рисуем треугольники справа
            sierpinski(n - 1, x + (length / 2.0), y, length / 2);
        }
    }

    //  Принимаем целочисленный аргумент командной строки n;
    //  рисуем контур равностороннего треугольника (направленного вверх) длиной 1;
    //  чья нижняя левая вершина равна (0, 0), а нижняя правая вершина равна (1, 0); и
    //  рисуем треугольник Серпинского порядка n, который плотно вписывается в контур.

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // Длинна треугольника по контуру
        double length = 1;
        // Находим высоту треугольника
        double h = height(length);
        // Рисуем треугольник направленный вверх, чтобы нарисовать контур
        StdDraw.polygon(new double[] { 0, length / 2, length }, new double[] {
                0, h, 0
        });
        // Рисуем n уровневый треугольник Серпинского
        sierpinski(n, length / 2, 0, length / 2);
    }
}
