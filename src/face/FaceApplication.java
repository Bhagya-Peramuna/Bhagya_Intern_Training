package face;

import common.drawer.Drawer;

public class FaceApplication {
    public static void main(String[] args) {
        FaceBuilder faceBuilder = new FaceBuilder();

        FaceColourTheme theme1 = new FaceColourTheme();
        FaceColourTheme theme2 = new FaceColourTheme();

        SmileyFace smileyFace1 = faceBuilder.buildSmileyFace(theme1.faceYellowTheme1, theme1.eyeLightBlueTheme1, theme1.mouthRedTheme1);

        Drawer drawer1 = new Drawer(80, 80);
        drawer1.draw(smileyFace1.getCircle());
        drawer1.draw(smileyFace1.getCrescent());
        drawer1.displayframe();

        SmileyFace smileyFace2 = faceBuilder.buildSmileyFace(theme2.faceDarkBlueTheme2, theme2.eyeLightRedTheme2, theme2.mouthGreenTheme2);
        Drawer drawer2 = new Drawer(80, 80);
        drawer2.draw(smileyFace2.getCircle());
        drawer2.draw(smileyFace2.getCrescent());
        drawer2.displayframe();


    }
}
