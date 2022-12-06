public class Car {
    // parameters = instance variables
    private int wheelsCount;
    private int year;
    private String color;
    private double volume;

    // конструктор
    public Car(int w, int y, String c, double v) {
        wheelsCount = w;
        year = y;
        color = c;
        volume = v;
    }

    // getters
    public int getWheelsCount() {
        return wheelsCount;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getVolume() {
        return volume;
    }

    // функция сравнивания 2 объектов
    public boolean equals(Car b) {
        return this.wheelsCount == b.wheelsCount &&
                this.year == b.year &&
                this.color == b.color &&
                this.volume == b.volume;
    }

    // метод toString - для печати содержимого объекта. Определяется автоматически при печати
    public String toString() {
        return "(" + wheelsCount + ", " + color + ", "
                + year + ", " + volume + ")";
    }

    // основная функция для присваивания значений и тестирования
    public static void main(String[] args) {
        Car redJaguar = new Car(4, 2016, "red", 5.0);
        Car tesla = new Car(4, 2020, "black", 0);

        System.out.println(redJaguar);
        System.out.println(tesla);
    }
}
