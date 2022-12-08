public class Date {
    private int day;
    private int month;
    private int year;
    private int age;

    public Date(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public boolean before(Date d) {
        return (this.year < d.year) ||
                (this.year == d.year && this.month < d.month) ||
                (this.year == d.year && this.month == d.month && this.day < d.day);
    }

    public boolean after(Date d) {
        return (this.year > d.year) ||
                (this.year == d.year && this.month > d.month) ||
                (this.year == d.year && this.month == d.month && this.day > d.day);
    }

    public String toString() {
        String[] months = {
                "January", "Feb", "March", "April",
                "May", "June", "July", "August",
                "September", "November", "December"
        };
        String result = months[month - 1] + " " + day + " " + year + " ";
        return result;
    }

    public int compareTo(Date d) {
        if (after(d)) return 1;
        if (before(d)) return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Date a = new Date(30, 8, 2022);
        Date b = new Date(12, 5, 2020);

        System.out.println("Now is after other = " + a.after(b));
        System.out.println("Now is before other = " + a.before(b));
        System.out.println("Compare value = " + a.compareTo(b));
        System.out.println(a.toString());
    }
}
