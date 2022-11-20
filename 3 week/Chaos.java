public class Chaos {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        // Рисуем треугольник
        double c = Math.sqrt(3.0) / 2.0; // Находим вершину треугольника
        double[] cx = { 0.0, 1.0, 0.5 }; // Координаты по оси X
        double[] cy = { 0.0, 0.0, c }; // Координаты по оси Y
        // setPenRadius(double r)
        // Set the pen size to the given size
        // Определяем толщину кисточки
        StdDraw.setPenRadius(0.01);
        // Определяем стартовые позиции
        double x = 0.0, y = 0.0;
        // Делаем loop, trials раз.
        for (int t = 0; t < trials; t++) {
            // Находим случайное число от 0 до 2, т.к. в массиве 3 элемента
            int r = (int) (Math.random() * 3);
            // Находим центры от координат, записанных в массике cx, cy
            x = (x + cx[r]) / 2.0;
            y = (y + cy[r]) / 2.0;
            // Рисуем точку
            StdDraw.point(x, y);
        }
    }
}
