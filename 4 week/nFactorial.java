public class nFactorial {
    // Считает факториал числа N

    public static long factorial(long n) {
        if (n == 0) return 1; // Base case
        long result = factorial(n - 1) * n; // Inductive step (расчетная формула)
        return result; // Возвращаем значение
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println(factorial(x));
    }
}
