public class HowMany {
    public static void main(String[] args) {
        int n = args.length;

        System.out.print("Вы набрали " + n + " аргумент");
        if (n == 1) {
            System.out.print(".");
        }
        else {
            System.out.print("ов.");
        }
    }
}
