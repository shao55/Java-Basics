public class FivePerLine_Second {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i <= 2000; i++) {
            count += 1;
            System.out.print(i + " ");
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
