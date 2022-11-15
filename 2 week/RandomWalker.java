public class RandomWalker {
    public static void main(String[] args) {
        int randomSteps = Integer.parseInt(args[0]);

        // Starting position
        int x = 0;
        int y = 0;
        System.out.println("Start position: " + "(" + x + "," + y + ")");
        // Random steps
        for (int i = 0; i < randomSteps; i++) {
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
            System.out.println("Reached position: " + "(" + x + "," + y + ")");
        }
        System.out.println("Squared distance = " + (x * x + y * y));
    }
}
