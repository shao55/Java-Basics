public class AllEqual {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // 1 вариант
        // if (a == b && b == c && a == c) {
        //     System.out.println("All are equals");
        // }
        // else {
        //     System.out.println("All are not equals");
        // }

        // 2 вариант
        String equals = (a == b && b == c) ? "All are equals" : "All are not equals";
        System.out.println(equals);
    }
}
