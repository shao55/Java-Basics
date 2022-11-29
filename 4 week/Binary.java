public class Binary {
    public static String convert(int n) {
        if (n == 1) return "1"; // base case
        return convert(n / 2) + (n % 2); // inductive step
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdOut.println(convert(n));
    }
}
