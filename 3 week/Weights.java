public class Weights {
    public static void main(String[] args) {
        /* Write a program KickBoxer.java that takes an integer weight w as a command line input
        and prints the corresponding kickboxing weight - class according to the table below.Use an
        integer array to store the weight limits and a string array to store the weight categories
        (ranging from Flyweight to Super Heavyweight) */

        int weight = Integer.parseInt(args[0]); // Вводим вес, для определения весовой категории
        // Массивы weights и categories должны совпадать по длинне и данным.
        int[] weights = {
                112, 115, 118, 122, 126, 130, 135, 140,
                147, 154, 160, 167, 174, 183, 189, 198, 209, 9999
        };

        String[] categories = {
                "Fly Weight", "Super Fly Weight", "Bantam Weight", "Super Bantam Weight",
                "Feather Weight", "Super Feather Weight", "Light Weight",
                "Super Light Weight", "Welter Weight", "Super Welter Weight",
                "Middle Weight", "Super Middle Weight", "Light Heavy Weight",
                "Super Light Heavy Weight",
                "Cruiser Weight", "Super Cruiser Weight", "Heavy Weight",
                "Super Heavy Weight"
        };

        for (int i = 0; i < weights.length; i++) {
            // Проверяем соответствие введенных значений в массиве
            if (weight < weights[i]) {
                // В зависимости от индекса weights печатаем элемент в массиве categories
                System.out.println(categories[i]);
                break;
            }
            if (weight > weights[weights.length - 1]) {
                System.out.println("Super-Puper Heavy Weight");
                break;
            }
        }
    }
}
