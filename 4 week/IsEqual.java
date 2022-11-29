public class IsEqual {

    public static boolean equal(int[] a, int[] b) {
        // Первый случай - Если массивы не равны по длинне - сразу возвращаем false
        if (a.length != b.length) {
            return false;
        }
        // Второй случай - Сравниваем каждый элемент массива на несовпадения
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        // Если первое и второе условия не сработали - возвращать true
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 3, 2, 1 };
        System.out.println(equal(a, b));
    }
}
