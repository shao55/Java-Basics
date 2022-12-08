public class stringReverse {

    public static String reverse(String a) {
        // пустая переменная для записи результата
        String b = "";
        // цикл для обратного отсчета в цикле
        for (int i = a.length() - 1; i >= 0; i--) {
            // в переменную b записывать каждое значение
            b += a.charAt(i);
        }
        // возвращаем результат
        return b;
    }

    public static void main(String[] args) {
        // принимаем значения
        String result = StdIn.readString();
        // печатаем значения
        StdOut.println(reverse(result));
    }
}
