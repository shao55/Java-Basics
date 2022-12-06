import java.util.List;

public class WelcomeBattle {
    // Найти сумму элементов в динамическом массиве ar
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }

    // Найти сумму элементов в динамическом массиве с большими цифрами
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }

    /* You are in charge of the cake for a child's birthday.
    You have decided the cake will have one candle for each year of their total age.
    They will only be able to blow out the tallest of the candles.
    Count how many candles are tallest. */
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Переменные для счетчика совпадений и записи наибольших значений
        int count = 0, biggest = 0;
        /* В первом цикле, если элемент массива больше переменной biggest,
        записываем элемент в эту же переменную если true */
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > biggest) {
                biggest = candles.get(i);
            }
        }
        /* Во втором цикле, проверяем каждый элемент массива с записанным значением в biggest после первого цикла.
           Если true, то увеличиваем счетчик count на 1 */
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) == biggest) {
                count++;
            }
        }
        // Возвращаем записанное значение счетчика
        return count;
    }

    /* Its base and height are both equal to .
    It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
    Write a program that prints a staircase of size . */
    public static void staircase(int n) {
        // Большой цикл для имитации матрицы, чтобы сосчитать i и j элементы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Главное условие, чтобы сравнить j и i элементы, нужно чтобы i == j => false => напечатать #
                // Каждую новую строчку будет другое условие
                if (j < n - 1 - i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    /* Given a square matrix, calculate the absolute difference between the sums of its diagonals.
       For example, the square matrix  is shown below:
       1 2 3
       4 5 6
       9 8 9 */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int lSum = 0, rSum = 0, ans = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) {
                    lSum += arr.get(i).get(j);
                }
                if (i == arr.get(i).size() - j - 1) {
                    rSum += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(lSum - rSum);
    }

    public static void main(String[] args) {

    }
}
