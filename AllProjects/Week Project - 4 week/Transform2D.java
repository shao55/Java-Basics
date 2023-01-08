public class Transform2D {
    // Увеличиваем полигон в alpha раз
    public static void scale(double[] x, double[] y, double alpha) {
        // Каждый элементв массиве x умножаем на alpha
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * alpha;
        }
        // Каждый элементв массиве y умножаем на alpha
        for (int i = 0; i < y.length; i++) {
            y[i] = y[i] * alpha;
        }
    }

    // Переносим полигон на другие координаты
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] + dx;
        }
        for (int i = 0; i < y.length; i++) {
            y[i] = y[i] + dy;
        }
    }

    // Копируем массив координат чтобы функции rotate и translate работали с ним
    public static double[] copy(double[] array) {
        // Пустой новый массив чтобы сохранить в нем новые координаты
        double[] newArray = new double[array.length];
        // Через цикл записываем скопированные координаты в новый массив
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // Поворачиваем полигон на theta градусов
    public static void rotate(double[] x, double[] y, double theta) {
        double xt, yt;
        // Переводим градусы в радианы для функции Math.cos
        double thetaRad = Math.toRadians(theta);
        // Через формулу меняем координаты
        for (int i = 0; i < x.length && i < y.length; i++) {
            xt = x[i] * Math.cos(thetaRad) - y[i] * Math.sin(thetaRad);
            yt = y[i] * Math.cos(thetaRad) + x[i] * Math.sin(thetaRad);
            x[i] = xt;
            y[i] = yt;
        }
    }

    // Основная функция для тестирования и отрисовки разных фигур
    public static void main(String[] args) {
        // Рисуем координаты
        StdDraw.setScale(-5.0, +5.0);
        // Исходные координаты полигона
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };
        // Скопированные массивы координат для функций rotate и translate
        double[] cx = copy(x);
        double[] cy = copy(y);

        // Задаем цвет полигона и рисуем исходный
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);

        Transform2D.rotate(cx, cy, 45.0);
        Transform2D.translate(cx, cy, 3.0, 3.0);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.polygon(cx, cy);

        // Увеличиваем полигон
        scale(x, y, 2.0);
        // Задаем цвет и рисуем измененный полигон
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }
}

