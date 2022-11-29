public class NInt {

    public static int rounded(double x) {
        // Классический вариант
        int roundedX = (int) x;
        if (x - roundedX < 0.5) {
            return roundedX;
        }
        else {
            return roundedX + 1;
        }
    }

    public static int rounded1(double x) {
        // Второй вариант с тернарным оператором
        int roundedX = (int) x;
        return roundedX + (x - roundedX < 0.5 ? 0 : 1);
    }

    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        System.out.println(rounded(n));
    }
}
