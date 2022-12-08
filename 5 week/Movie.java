public class Movie {
    // Объявление переменных класса, переменные в классе всегда private, потом тип данных, и название переменной
    private String name;
    private int year;
    private String director;
    private double rating;

    // Пустой контруктор для answer по топовому фильму
    public Movie() {
        name = "";
        year = 0;
        director = "";
        rating = -1;
    }

    // Конструктор, он присваивает принятые значения к переменным класса
    public Movie(String newName, int newYear, String newDirector, double newRating) {
        this.name = newName;
        this.year = newYear;
        this.director = newDirector;
        this.rating = newRating;
    }

    // Метод toString для печати данных класса
    public String toString() {
        return name + " " + year;
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        // Пустой массив из класса Movie
        Movie[] movies = new Movie[n];
        // recall how you create an array of integers:
        // int[] a = new int[n];
        // Цикл для присваивания значений
        for (int i = 0; i < n; ++i) {
            // Считываем данные через метод .read
            String name = StdIn.readString();
            int year = StdIn.readInt();
            String director = StdIn.readString();
            double rating = StdIn.readDouble();
            // Создаем объект с введенными значениями
            movies[i] = new Movie(name, year, director, rating);
        }
        // Пустой объект answer класса Movie, который обращается к пустому конструктору
        Movie answer = new Movie();
        // Цикл для записи топового фильма, при условии
        for (int i = 0; i < n; ++i) {
            // compare current movie with our "best" answer movie
            // and if it's better (in rating) then update our answer
            // Если в объекте movies, элемент rating будет выше чем в пустом конструкторе answer элемента rating
            if (movies[i].rating > answer.rating) {
                // Тогда записываем объект movies каждого индекса в пустой объект answer
                answer = movies[i];
            }
        }
        // Печатаем объект answer
        // Благодаря toString() выведет название фильма в объекте, так как мы описали это выше
        System.out.println(answer);
    }
}
