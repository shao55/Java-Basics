public class Example2D {
    public static void main(String[] args) {
        // Матрица
        int[][] a = {
                { 21, 21, 20, 21 },
                { 11, 12, 15, 9 },
                { 60, 50, 58, 58 }
        };
        // Печать матрицы
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
