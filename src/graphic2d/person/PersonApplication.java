package graphic2d.person;

import common.drawer.Shape;
import person.Person;

import javax.swing.*;
import java.util.Collection;

public class PersonApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            Person pers = PersonBuilder.buildPerson();
            Collection<Shape> branches = pers.getLimbs();
            Collection<Shape> circle = pers.getCircle();
            Collection<Shape> cresent = pers.getCrescent();
            PersonDrawer drawerGUI = new PersonDrawer(branches,circle,cresent);

            JFrame frame = new JFrame("Tree Drawer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            frame.add(drawerGUI);
            frame.setVisible(true);
        });
    }
}
