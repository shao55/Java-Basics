public class RunningSum {
    public static void main(String[] args) {
        // Кладем в переменную количество введённых аргументов.
        int len = args.length;
        // Создаю массив с длинной равной введённым элементам
        int[] nums = new int[len];
        // Заполняем массив циклом, элементами из args[Индекс элементов].
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        int sum = 0;
        // Новый пустой массив, длинной len, чтобы хранить суммированные числа.
        int[] runningSum = new int[len];
        // Цикл для суммирования аргументов и присваиванию к массиву.
        for (int i = 0; i < len; i++) {
            // Суммирую в переменную sum каждый элемент введённых цифр.
            sum += nums[i];
            // При каждой итерации цикла кладу полученную sum в массив runningSum.
            runningSum[i] = sum;
        }
        // Печатаем массив runningSum[i] с полученными заполненными суммами из sum.
        for (int i = 0; i < len; i++) {
            System.out.print(runningSum[i] + " ");
        }
    }
}
