public class RandomCards {
    public static void main(String[] args) {
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] suit = { "♣", "♦", "♥", "♠" };
        String[] deck = new String[52];

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[i * 13 + j] = rank[j] + suit[i];
            }
        }

        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            int r = (int) (Math.random() * deck.length);
            System.out.println(deck[r]);
        }
    }
}
