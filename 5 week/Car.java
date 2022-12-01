public class Car {

    // parameters = instance variables
    private static int wheelsCount;
    private int year;
    private String color;
    private double volume;

    public Car(int w, int y, String c, double v) {
        wheelsCount = w;
        year = y;
        color = c;
        volume = v;
    }

    // getters
    public static int getWheelsCount() {
        return wheelsCount;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Car redJaguar = new Car(4, 2016, "red", 5.0);
        // Car[] garage = new Car[10];

        // Car teslaModelY = new Car(4, 2018, "white", 0.0);
        // Car camry = new Car(4, 2020, "black", 3.5);
        System.out.println(redJaguar.getWheelsCount());
    }
}
