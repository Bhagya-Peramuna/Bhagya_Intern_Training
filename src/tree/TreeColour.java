package tree;

public class TreeColour {
    public static String[] trunckColour = {
            "\u001b[48;2;139;69;19m \u001b[0m",//brown
            "\u001b[48;2;128;0;128m \u001b[0m",//purple
            "\u001b[48;2;255;255;0m \u001b[0m",//yellow

            "\u001b[48;2;0;0;255m \u001b[0m",
            "\u001b[48;2;255;0;0m \u001b[0m",
    };

    public static String[] branchColour = {
            "\u001b[48;2;139;69;19m \u001b[0m",//brown
            "\u001b[48;2;128;0;128m \u001b[0m",//purple
            "\u001b[48;2;255;0;0m \u001b[0m",
    };
    public static String[] leavesColourOne = {
            "\u001b[48;2;0;100;0m \u001b[0m",//dark green
            "\u001b[48;2;0;0;128m \u001b[0m",//dark blue

            "\u001b[48;2;0;0;255m \u001b[0m",
            "\u001b[48;2;255;0;0m \u001b[0m",
    };
    public static String[] leavesColourTwo = {
            "\u001b[48;2;144;238;144m \u001b[0m",//light green
            "\u001b[48;2;173;216;230m \u001b[0m", //light blue

            "\u001b[48;2;0;0;255m \u001b[0m",
            "\u001b[48;2;255;0;0m \u001b[0m",
    };






    public static String getTrunckColour(int themeIndex) {
        return trunckColour[themeIndex];
    }
    public static String getBranchColour(int themeIndex) {
        return branchColour[themeIndex];
    }public static String getLeavesColourOne(int themeIndex) {
        return leavesColourOne[themeIndex];
    }public static String getLeavesColourTwo(int themeIndex) {
        return leavesColourTwo[themeIndex];
    }











}
