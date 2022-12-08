public class printAll {
    public static void printAllSum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (0 < i && i < j && j < k && k < arr.length
                            && (arr[i] + arr[j] + arr[k]) == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 4, -4, 1, -1, 0, 3, -3, -6 };
        printAllSum(arr);
    }
}
