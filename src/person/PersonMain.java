package person;

import common.drawer.Drawer;

public class PersonMain {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        Person person1 = personBuilder.buildPerson(0);
        Drawer drawer1 = new Drawer(80,80);
        drawer1.draw(person1.getBody());
        drawer1.draw(person1.getLimbs());
        drawer1.draw(person1.getCircle());
        drawer1.draw(person1.getCrescent());
        drawer1.displayframe();


        Person person2 = personBuilder.buildPerson(1);
        Drawer drawer2 = new Drawer(80,80);
        drawer2.draw(person2.getBody());
        drawer2.draw(person2.getLimbs());
        drawer2.draw(person2.getCircle());
        drawer2.draw(person2.getCrescent());
        drawer2.displayframe();

    }

}
