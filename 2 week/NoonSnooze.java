public class NoonSnooze {
    public static void main(String[] args) {
        int minNum = Integer.parseInt(args[0]);
        int hours = 12;
        int mins = 00;

        hours = (hours + minNum / 60) % 12;
        if (hours == 0) {
            hours = 12;
        }

        mins = minNum % 60;

        if (minNum / 60 / 12 % 2 == 0) {
            System.out.println(hours + ":" + String.format("%02d", mins) + " pm");
        }
        else {
            System.out.println(hours + ":" + String.format("%02d", mins) + " am");
        }
    }
}
