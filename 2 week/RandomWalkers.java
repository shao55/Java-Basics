public class RandomWalkers {
    public static void main(String[] args) {
        // Steps
        int n = Integer.parseInt(args[0]);
        // Trials
        int trials = Integer.parseInt(args[1]);
        // Starting position
        int x = 0;
        int y = 0;
        double totalSquaredDistance = 0;
        // Loop from RandomWalker
        for (int j = 0; j < trials; j++) {
            x = 0;
            y = 0;
            for (int i = 0; i < n; i++) {
                double randomStep = Math.random();
                if (randomStep < 0.25) {
                    x++;
                }
                else if (randomStep < 0.5) {
                    y++;
                }
                else if (randomStep < 0.75) {
                    x--;
                }
                else if (randomStep < 1) {
                    y--;
                }
            }
            double squaredDistance = (x * x + y * y);
            totalSquaredDistance = totalSquaredDistance + squaredDistance;
        }
        System.out.println("Mean squared distance = " + totalSquaredDistance / trials);
    }
}
