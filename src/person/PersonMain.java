package person;

import common.drawer.Drawer;

public class PersonMain {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        PersonColourTheme theme1 = new PersonColourTheme();

        Person person1 = personBuilder.buildPerson(theme1.faceYellowTheme1, theme1.eyeDarkGreenTheme1, theme1.bodyBrownTheme1);
        Drawer drawer1 = new Drawer(80,80);
        drawer1.draw(person1.getBody());
        drawer1.draw(person1.getLimbs());
        drawer1.draw(person1.getCircle());
        drawer1.draw(person1.getCrescent());
        drawer1.displayframe();

        PersonColourTheme theme2 = new PersonColourTheme();

        Person person2 = personBuilder.buildPerson(theme2.faceDarkBlueTheme2, theme2.eyeLightBlueTheme2, theme2.bodyLightGreenTheme2);
        Drawer drawer2 = new Drawer(80,80);
        drawer2.draw(person2.getBody());
        drawer2.draw(person2.getLimbs());
        drawer2.draw(person2.getCircle());
        drawer2.draw(person2.getCrescent());
        drawer2.displayframe();

    }

}
