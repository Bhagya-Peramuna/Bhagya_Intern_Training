package face;

public class FaceColour {
    public static String[] circleFaceColors = {
            "\u001b[48;2;255;255;0m \u001b[0m",
            "\u001b[48;2;0;0;255m \u001b[0m",
            "\u001b[48;2;255;0;0m \u001b[0m",
    };

    public static String[] circleEyeColors = {
            "\u001b[44m \u001b[0m",
            "\u001b[41m \u001b[0m",
            "\u001b[45m \u001b[0m",
    };

    public static String[] crescentColors = {
            "\u001b[48;2;255;0;0m \u001b[0m",
            "\u001b[48;2;0;255;0m \u001b[0m",
            "\u001b[48;2;0;0;255m \u001b[0m",
    };

    public static String getCircleFaceColor(int themeIndex) {
        return circleFaceColors[themeIndex];
    }

    public static String getCircleEyeColor(int themeIndex) {
        return circleEyeColors[themeIndex];
    }

    public static String getCrescentColor(int themeIndex) {
        return crescentColors[themeIndex];
    }



}
