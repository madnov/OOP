package family_tree;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        Human maksim = new Human("Maksim", LocalDate.of(1984, 8, 11), Gender.MALE);
        Human nataly = new Human("Nataly", LocalDate.of(1985, 7, 15), Gender.FEMALE);
        Human peter = new Human("Peter", LocalDate.of(2015, 12, 9), Gender.MALE);
        Human diana = new Human("Diana", LocalDate.of(2008, 4, 16), Gender.FEMALE);
        Human yuriy = new Human("Yuriy", LocalDate.of(1956, 12, 9), Gender.MALE);
        Human kate = new Human("Kate", LocalDate.of(1956, 3, 20), Gender.FEMALE);
        Human maria = new Human("Maria",LocalDate.of(1946,8,19),Gender.FEMALE);


        maria.setDeathDate(LocalDate.of(2008,01,30));
        maksim.addParent(yuriy);
        maksim.addChild(diana);
        maksim.addChild(peter);
        maksim.addParent(kate);
        nataly.addParent(yuriy);
        nataly.addParent(kate);
        peter.addParent(maksim);
        peter.addParent(nataly);
        diana.addParent(maksim);
        diana.addParent(nataly);

        familyTree.addHuman(maria);
        familyTree.addHuman(maksim);
        familyTree.addHuman(nataly);
        familyTree.addHuman(peter);
        familyTree.addHuman(diana);
        familyTree.addHuman(yuriy);
        familyTree.addHuman(kate);

        List<Human> maksimsChildren = familyTree.getAllChildren(maksim);
        System.out.println("maksim's children:");
        for (Human child : maksimsChildren) {
            System.out.println(child.getName());
        }
        List<Human> allPeople = maksim.getAllPeople();
        for (Human person : allPeople) {
            System.out.println(person.getName());    
        }
    }
}
