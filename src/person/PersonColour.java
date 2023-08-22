package person;

public class PersonColour {
    public static String personFaceColor = "\u001b[48;2;255;255;0m \u001b[0m";
    public static String personEyeColor = "\u001b[44m \u001b[0m";
    public static String personMouthColor ="\u001b[48;2;255;0;0m \u001b[0m";


    public static String getPersonFaceColor() {
        return personFaceColor;
    }

    public static String getPersonEyeColor() {
        return personEyeColor;
    }

    public static String getPersonMouthColor() {
        return personMouthColor;
    }

}
