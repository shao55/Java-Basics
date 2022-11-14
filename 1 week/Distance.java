public class Distance {
    public static void main(String[] args) {
        // Принимаем 2 значения для осей x и y, и конвертируем строку в число
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // Рассчитываем Евклидово расстояние
        double evkld = Math.sqrt(x * x + y * y);

        // Выводим на экран полученное значение
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + evkld);
    }
}
