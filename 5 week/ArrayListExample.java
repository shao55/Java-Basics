import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList - новый метод для создания динамического массива
        ArrayList<Integer> a = new ArrayList<Integer>();
        // add - метод добавления значений в динамический массив
        a.add(100);
        a.add(200);
        a.add(300);
        // remove - удаление значений из динамического массива
        a.remove(1);
        // size - метод для показа размера динамического массива
        for (int i = 0; i < a.size(); i++) {
            // get - метод для доступа к элементам динамического массива
            System.out.println(a.get(i)); // b[i], c[i] - методы для статического массива
        }
    }
}
