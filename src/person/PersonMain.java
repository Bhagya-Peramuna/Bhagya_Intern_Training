package person;

import common.drawer.Drawer;
import face.SmileyFace;
import tree.Tree;

public class PersonMain {
    public static void main(String[] args) {

        PersonBuilder person1 = new PersonBuilder();
        PersonColourTheme theme1 = new PersonColourTheme();

        SmileyFace psmil = person1.pFaceBuilder(theme1.faceYellowTheme1, theme1.eyeDarkGreenTheme1, theme1.bodyBrownTheme1);
        Tree pbody = person1.pBodyBuilder(theme1.faceYellowTheme1);

        Drawer drawer1 = new Drawer(80,80);

        drawer1.draw((pbody.getBranches()));
        drawer1.draw((pbody.getTrunks()));
        drawer1.draw((psmil.getCircle()));
        drawer1.draw((psmil.getCrescent()));


        drawer1.displayframe();

        PersonColourTheme theme2 = new PersonColourTheme();

    }

}
