public class DistinctNumbers {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && b == c) {
            System.out.println("Distinct Numbers = 1");
        }
        else if (a != b && b != c && a != c) {
            System.out.println("Distinct Numbers = 3");
        }
        else {
            System.out.println("Distinct Numbers = 2");
        }
    }
}
