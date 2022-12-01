import java.util.ArrayList;

public class Dynamic2D {
    public static void main(String[] args) {
        // Пример матрицы
        // int[][] a = {
        //         { 21, 21, 20, 21 },
        //         { 11, 12, 15, 9 },
        //         { 60, 50, 58, 58 }
        // };

        // Создаем динамическую матрицу
        ArrayList<ArrayList<Integer>> a =
                new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> row0 = new ArrayList<Integer>();
        row0.add(21);
        row0.add(21);
        row0.add(20);
        row0.add(21);
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        row1.add(11);
        row1.add(12);
        row1.add(15);
        row1.add(9);
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        row2.add(60);
        row2.add(50);
        row2.add(58);
        row2.add(58);

        a.add(row0);
        a.add(row1);
        a.add(row2);

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).size(); j++) {
                System.out.print(a.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
