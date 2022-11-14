public class SumOfTwoDice {
    public static void main(String[] args) {
        int x = 6; // Сколько сторон в кубике
        int a = (int) (Math.random() * x + 1); // Первое случайное число
        int b = (int) (Math.random() * x + 1); // Второе случайное число
        int sum = a + b; // Суммируем аргументы
        System.out.println(sum); // Выводим на экран
    }
}
