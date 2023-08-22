package face;


import common.drawer.Drawer;

public class Main {
    public static void main(String[] args) {
        FaceBuilder faceBuilder = new FaceBuilder();
        SmileyFace smileyFace = faceBuilder.buildSmileyFace();
        Drawer drawer = new Drawer(80,80);
        drawer.draw(smileyFace.getCircle());
        drawer.draw(smileyFace.getCrescent());


        drawer.displayframe();


    }
}
