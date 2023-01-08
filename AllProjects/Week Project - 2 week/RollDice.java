public class RollDice {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x[] = new int[61];
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = 0; j < 10; j++) {
                int dice = (int) (Math.random() * 6 + 1);
                s += dice;
            }
            x[s]++;
        }
        for (int i = 10; i < x.length; i++) {
            System.out.print(i + ":");
            for (int k = 0; k < x[i]; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
