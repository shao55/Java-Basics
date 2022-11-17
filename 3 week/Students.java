public class Students {
    public static void main(String[] args) {
        // int section4 = 4;
        // int section5 = 5;
        int n = StdIn.readInt();
        String[] names = new String[n];
        String[] surnames = new String[n];
        String[] emails = new String[n];
        int[] sections = new int[n];


        // read data from students.txt file
        for (int i = 0; i < n; i++) {
            names[i] = StdIn.readString();
            surnames[i] = StdIn.readString();
            emails[i] = StdIn.readString();
            sections[i] = StdIn.readInt();

            // if (sections[i] == section5)
            //     System.out.println(names[i] + " " + surnames[i] + " " + emails[i]);
        }

        // section 4
        System.out.println("section 4");
        for (int i = 0; i < n; i++) {
            if (sections[i] == 4)
                System.out.println(names[i] + " " + surnames[i] + " " + emails[i]);
        }
        System.out.println();

        // section 5
        System.out.println("section 5");
        for (int i = 0; i < n; i++) {
            if (sections[i] == 5)
                System.out.println(names[i] + " " + surnames[i] + " " + emails[i]);
        }
    }
}
