public class DrunkenMaster {
    public static void main(String[] args) {
        /*
            DrunkenMaster. Start position = (0, 0).
            What's your end position given moving instructions from the command line?
            Input: LLDDRD
            (0;0)
         */

        // moves - вводимые значения
        String moves = args[0];
        // move - переменная для хранения каждого знача вводимых значений
        String move = "";
        // Начальные позиции
        // Можно объявлять переменные через запяту, но они должны быть одного вида!
        int x = 0, y = 0;

        // Цикл для перемещения в зависимости от введенных значений
        for (int i = 0; i < moves.length(); i++) {
            // Метод valueOf() возвращает строковое представление переданного аргумента. Только для String!
            // Метод charAt() возвращает указанный символ из строки, в зависимости от индекса введенных значений.
            move = String.valueOf(moves.charAt(i));
            // Если найдено "F"
            // Метод equals() – сравнивает строку с указанным объектом.
            // Результатом является значение true только в том случае,
            // если аргумент не равен null и является строковым объектом (String),
            // который представляет ту же последовательность символов как и этот объект.
            if (move.equals("L") || move.equals("l")) {
                // Увеличивать значение по оси Y на один
                x--;
            }
            if (move.equals("R") || move.equals("r")) {
                x++;
            }
            if (move.equals("D") || move.equals("d")) {
                y--;
            }
            if (move.equals("U") || move.equals("u")) {
                y++;
            }
        }
        System.out.println("End position: " + x + " " + y);
    }
}
