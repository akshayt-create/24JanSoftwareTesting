package inheritance;

public class Son extends Mother {       //extends

    String colour = "xyz";

    public void weight() {
        System.out.println("Son's weight");
    }

    public static void hobbies() {
        System.out.println("Son's hobbies");
    }

    static void main(String[] args) {

        //calling mother class(super class) method(property) directly in son class's main method
        //because of inheritance(Sons extends Mother)
        height();

        Son son = new Son();
        son.weight();       //calling Son class method
        son.nature();       //calling mother class method using Son class object

        //calling mother class static methods directly because we are in same class (inheritance)
        height();
        hobbies();

    }
}
