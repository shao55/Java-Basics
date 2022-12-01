import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        // Статические массивы
        int[] childrenA = { 2019, 2020, 2021 };
        int[] childrenB = { 2018, 2018, 2017, 2015 };
        // Новый пустой динамический массив
        ArrayList<Integer> kindergarten = new ArrayList<Integer>();
        // Записываем первый статический в динамический массив
        for (int i = 0; i < childrenA.length; i++) {
            kindergarten.add(childrenA[i]);
        }
        // Записываем второй статический в динамический массив
        for (int i = 0; i < childrenB.length; i++) {
            kindergarten.add(childrenB[i]);
        }
        // Печатаем размер динамического массива
        System.out.println(kindergarten.size());
    }
}
