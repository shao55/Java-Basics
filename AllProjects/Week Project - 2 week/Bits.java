public class Bits {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("Illegal input");
        }
        else {
            int counter = 0;
            while (n >= 1) {
                n = n / 2;
                counter++;
            }
            System.out.println(counter);
            // double x = 1 + Math.log(2) * n;
            // System.out.println((int) Math.floor(x));
        }
    }
}
