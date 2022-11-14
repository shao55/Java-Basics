public class RandomArray {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        double sum = 0;
        double avg = 0;
        double min = 0;
        double[] arr = new double[x];
        for (int i = 0; i < x; i++) {
            arr[i] = Math.random();
            System.out.println(arr[i] + " ");
            sum += arr[i];
            avg = sum / arr.length;
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
