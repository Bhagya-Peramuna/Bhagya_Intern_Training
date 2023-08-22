package face;

public class FaceColour {
    public static String circleFaceColor = "\u001b[48;2;255;255;0m \u001b[0m";
    public static String circleEyeColor = "\u001b[44m \u001b[0m";
    public static String crescentColor ="\u001b[48;2;255;0;0m \u001b[0m";


    public static String getCircleFaceColor() {
        return circleFaceColor;
    }

    public static String getCircleEyeColor() {
        return circleEyeColor;
    }

    public static String getCrescentColor() {
        return crescentColor;
    }
}
