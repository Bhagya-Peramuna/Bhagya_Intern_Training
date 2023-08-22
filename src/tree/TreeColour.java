package tree;

public class TreeColour {
    public static String trunckColour = "\u001b[48;2;139;69;19m \u001b[0m";
//    public static String branchColour = "\u001b[48;2;139;69;19m \u001b[0m";
    public static String leavesColourOne = "\u001b[42m \u001b[0m";
    public static String leavesColourTwo = "\u001B[48;2;0;100;0m \u001B[0m";
    public static String branchColour = "\u001B[48;2;0;0;100m \u001B[0m";


    public static String getTrunckColour() {
        return trunckColour;
    }

    public static String getBranchColour() {
        return branchColour;
    }

    public static String getLeavesColourOne() {
        return leavesColourOne;
    }

    public static String getLeavesColourTwo() {
        return leavesColourTwo;
    }
}
