public class RGBtoCMYK {
    public static void main(String[] args) {
        int red = Integer.parseInt(args[0]);
        int green = Integer.parseInt(args[1]);
        int blue = Integer.parseInt(args[2]);
        double getMaxWhiteRG = Math.max((double) red / 255, (double) green / 255);
        double getMaxWhiteRGB = Math.max(getMaxWhiteRG, (double) blue / 255);
        double cyan = ((getMaxWhiteRGB - ((double) red / 255)) / getMaxWhiteRGB);
        double magenta = ((getMaxWhiteRGB - ((double) green / 255)) / getMaxWhiteRGB);
        double yellow = ((getMaxWhiteRGB - ((double) blue / 255)) / getMaxWhiteRGB);
        double black = 1 - getMaxWhiteRGB;

        System.out.println("Red: " + red);
        System.out.println("Green: " + green);
        System.out.println("Blue: " + blue);
        System.out.println("Cyan: " + cyan);
        System.out.println("Magenta: " + magenta);
        System.out.println("Yellow: " + yellow);
        System.out.println("Black: " + black);
    }
}
