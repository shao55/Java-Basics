public class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long[] F = new long[n + 1];
        F[0] = 0;
        F[1] = 1;
        // Цикл начинается с 2, т.к. 0 и 1 индексы уже описаны выше, и их значения уже известны
        for (int i = 2; i <= n; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        StdOut.println(F[n]);
    }
}
