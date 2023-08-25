package graphic2d.person;

import common.drawer.Shape;
import person.Person;
import person.PersonBuilder;
import person.PersonColourTheme;

import javax.swing.*;
import java.util.Collection;

public class PersonApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PersonColourTheme theme1 = new PersonColourTheme();

            Person pers = PersonBuilder.buildPerson2D(theme1.faceYellowTheme1, theme1.eyeDarkGreenTheme1, theme1.bodyBrownTheme1);
            Collection<Shape> branches = pers.getLimbs();
            Collection<Shape> circle = pers.getCircle();
            Collection<Shape> cresent = pers.getCrescent();
            PersonDrawer2D drawerGUI = new PersonDrawer2D(branches,circle,cresent);

            JFrame frame = new JFrame("Tree Drawer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            frame.add(drawerGUI);
            frame.setVisible(true);
        });
    }
}
