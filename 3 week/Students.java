public class Students {
    public static void main(String[] args) {
        /* Student database.
        The file students.txt contains a list of students enrolled in an introductory computer science class at Princeton.
        The first line contains an integer N that specifies the number of students in the database.
        Each of the next N lines consists of four pieces of information, separated by whitespace: first name, last name, email address, and section number.
        The program Students.java reads in the integer N and then N lines of data of standard input, stores the data in four parallel arrays (an integer array for the section number and string arrays for the other fields).
        Then, the program prints out a list of students in section 4 and 5. */

        int n = StdIn.readInt(); // Считываем данные, сколько студентов ищем
        // Создаем массивы для разного вида данных
        String[] names = new String[n];
        String[] surnames = new String[n];
        String[] emails = new String[n];
        int[] sections = new int[n];

        // Считываем данные с students.txt и кладем данные в массивы, разделенные по типам
        for (int i = 0; i < n; i++) {
            names[i] = StdIn.readString();
            surnames[i] = StdIn.readString();
            emails[i] = StdIn.readString();
            sections[i] = StdIn.readInt();
        }

        // Section 4
        System.out.println("section 4");
        for (int i = 0; i < n; i++) {
            // Если попадается массив с индексом 4, то выводим данные с этим индексом
            if (sections[i] == 4)
                System.out.println(names[i] + " " + surnames[i] + " " + emails[i]);
        }
        System.out.println();

        // section 5
        System.out.println("section 5");
        for (int i = 0; i < n; i++) {
            if (sections[i] == 5)
                System.out.println(names[i] + " " + surnames[i] + " " + emails[i]);
        }
    }
}
