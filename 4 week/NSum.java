public class NSum {

    public static int NSum(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        return NSum(x - 1) + x;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdOut.println(NSum(n));
    }
}
