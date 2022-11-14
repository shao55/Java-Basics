public class Month {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        String Month[] = {
                "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"
        };
        System.out.println(Month[x - 1]);
    }
}
