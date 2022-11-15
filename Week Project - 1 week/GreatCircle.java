public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        // Double x1 = Math.toRadians(x1Deg);
        // Double y1 = Math.toRadians(y1Deg);
        // Double x2 = Math.toRadians(x2Deg);
        // Double y2 = Math.toRadians(y2Deg);

        double distance = Math.toDegrees(60 * Math.acos(
                Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));

        System.out.println(distance + " nautical miles");
    }
}
