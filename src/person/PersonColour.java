package person;

public class PersonColour {
    public static String[] personFaceColor = {
            "\u001b[48;2;255;255;0m \u001b[0m",//yellow
            "\u001b[48;2;0;0;128m \u001b[0m",//dark blue
            "\u001b[48;2;255;0;0m \u001b[0m",
    };
    public static String[] personEyeColor = {
            "\u001b[48;2;0;100;0m \u001b[0m",//dark green
            "\u001b[48;2;173;216;230m \u001b[0m",//light blue
            "\u001b[48;2;255;0;0m \u001b[0m",
    };
    public static String[] bodyColour = {
            "\u001b[48;2;139;69;19m \u001b[0m",// brown
            "\u001b[48;2;144;238;144m \u001b[0m",//light green
            "\u001b[48;2;255;0;0m \u001b[0m",
    };




    public static String getPersonFaceColor(int themeIndex) {
        return personFaceColor[themeIndex];
    }
    public static String getPersonEyeColor(int themeIndex) {
        return personEyeColor[themeIndex];
    }
    public static String getPersonBodyColour(int themeIndex) {
        return bodyColour[themeIndex];
    }



}
