public class ChangePlaceArr {

    public static void transpose(int[][] a) {
        // Записываем длинну массива
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Условием if работаем только с нижними элементами от середины
                if (i < j) {
                    // Сохраняем каждый элемент в переменную
                    int k = a[i][j];
                    // Меняем местами ячейки в матрице
                    a[i][j] = a[j][i];
                    // Записываем элемент в новую ячейку
                    a[j][i] = k;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Входящий массив
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // Вызываем функцию
        transpose(a);
        // Печатаем массив
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
