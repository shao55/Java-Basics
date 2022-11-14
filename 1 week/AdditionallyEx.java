public class AdditionallyEx {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a + b;
        System.out.println(sum);

        int product = a * b;
        System.out.println(product);

        int quotient = a / b;
        System.out.println(quotient);

        int remainder = a % b;
        System.out.println(remainder);
    }
}
