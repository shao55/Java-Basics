import java.util.Arrays;

public class Functions {
    public static int max(int[] arr) {
        // Функция нахождения максимального значения
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            // Каждый элемент массива проверяем с объявленной переменной max
            if (arr[i] > max) {
                // Если элемент больше ( изначально 0) то записываем в переменную этот элемент
                max = arr[i];
            }
        }
        return max;
    }

    public static double median(int[] arr) {
        // Функция нахождения медианного значения в массиве
        Arrays.sort(arr); // Отсортировываем массив по возрастанию (опционально)
        int len = arr.length; // Переменная для хранения длинны массива
        double med = 0; // Переменная для хранения медианного значения
        // Проверка на четное или нечетное количество элементов в массиве
        if (len % 2 == 0) {
            med = (arr[len / 2] + arr[len / 2 - 1]) / 2.0;
        }
        else {
            med = arr[len / 2];
        }
        return med;
    }

    public static int sumSquare(int[] arr) {
        // Функция для нахождения суммы квадратов элементов массива
        int sumSq = 0;
        for (int i = 0; i < arr.length; i++) {
            sumSq += (arr[i] * arr[i]);
        }
        return sumSq;
    }

    public static int sumFunction(int[] array) {
        // Функция нахождения суммы всех элементов в массиве (вспомогательная)
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] arr) {
        // Функция нахождения среднего значения в массиве
        int sum = sumFunction(arr); // Вызываем вспомогательную функция описанную выше
        double average = (double) sum / arr.length;
        return average;
    }

    public static int freq(int[] arr) {
        int[] f = new int[11];
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            f[number]++;
        }

        int maxFrequent = 0;
        int frequentNumber = 0;
        for (int i = 0; i <= 10; i++) {
            if (maxFrequent < f[i]) {
                maxFrequent = f[i];
                frequentNumber = i;
            }
        }
        return frequentNumber;
    }

    public static void main(String[] args) {
        /* a - find maximum,
        c - Print the median element.,
        d - Print the element that occurs most frequently,
        e - Print the sum of the squares of the elements.,
        f - Print the average of the N elements. */
        int[] arr = { 3, 1, 5, 6, 7, 8 };
        System.out.println("Maximum is: " + max(arr));
        System.out.println("Median is: " + median(arr));
        System.out.println("Most frequently is: " + freq(arr));
        System.out.println("Sum of the squares is: " + sumSquare(arr));
        System.out.println("Average is: " + average(arr));
    }
}
