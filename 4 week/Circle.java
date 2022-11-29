import java.awt.Color;

public class Circle {
    public static void f(int n, double x, double y, double r) {
        if (n == 0) return;
        // Рисуем черный круг
        StdDraw.setPenColor(Color.black);
        StdDraw.circle(x, y, r);

        // Назвачаем рандомный цвет
        int R = (int) (Math.random() * 256);
        int G = (int) (Math.random() * 256);
        int B = (int) (Math.random() * 256);
        StdDraw.setPenColor(R, G, B);

        // Рисуем закрашенный круг
        StdDraw.filledCircle(x, y, r);

        // Рисуем вложенные круги (фрактальные круги)
        // n - 1 это отрисовываем фрактал до 0
        // r / 2 это половина радиуса, точка по опси x
        // y не меняется, т.к. по оси y для центра круга не меняется
        f(n - 1, x - r / 2, y, r / 2); // Левый круг
        f(n - 1, x + r / 2, y, r / 2); // Правый круг
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        f(n, 0.5, 0.5, 0.5);
    }
}
