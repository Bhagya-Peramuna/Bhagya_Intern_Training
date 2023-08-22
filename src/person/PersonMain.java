package person;

import common.drawer.Drawer;

public class PersonMain {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.buildPerson();


        Drawer drawer = new Drawer(80,80);

        drawer.draw(person.getBody());
        drawer.draw(person.getLimbs());
        drawer.draw(person.getCircle());
        drawer.draw(person.getCrescent());
        drawer.displayframe();

    }

}
