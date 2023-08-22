package face;


import common.drawer.Drawer;

public class FaceApplication {
    public static void main(String[] args) {
        FaceBuilder faceBuilder = new FaceBuilder();

        SmileyFace smileyFace1 = faceBuilder.buildSmileyFace(0);

        Drawer drawer1 = new Drawer(80,80);
        drawer1.draw(smileyFace1.getCircle());
        drawer1.draw(smileyFace1.getCrescent());
        drawer1.displayframe();



        SmileyFace smileyFace2 = faceBuilder.buildSmileyFace(2);
                Drawer drawer2 = new Drawer(80,80);
                drawer2.draw(smileyFace2.getCircle());
                drawer2.draw(smileyFace2.getCrescent());
                drawer2.displayframe();
    }
}
