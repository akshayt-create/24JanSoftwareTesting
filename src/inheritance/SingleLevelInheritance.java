package inheritance;

public class SingleLevelInheritance {

    static void main(String[] args) {

        Mother  mother = new Mother();
        mother.nature();        //calling super class method
        Mother.height();        //calling super class method
        System.out.println("=================================");

        Son  son = new Son();
        son.weight();       //calling sub-class method
        Son.hobbies();      //calling sub-class method
        System.out.println("=================================");

        son.weight();
        son.nature();       //calling mother class(super class) method(property) using son class(subclass) object
        Son.hobbies();
        Son.height();       //calling mother class(super class) method(property) using son class(subclass) reference
        System.out.println(son.bloodGroup);
        System.out.println(son.colour);

    }
}
