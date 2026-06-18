package interfaceStudy;

public interface Father {

    void hardwork();
    void honesty();
    default void love() {        //same method as in mother class
        System.out.println("Father's love");
    }

    static void kindness(){
        System.out.println("Father's kindness");
    }
}
/*
- Can we have complete methode inside interface? --> Yes, par sirf do hi condition
  me 1] method ko default karna padega, 2] otherwise method ko static banana padega.
- Why? --> To achieve multiple inheritance.
 */
