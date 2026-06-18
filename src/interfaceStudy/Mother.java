package interfaceStudy;

public interface Mother {

    void nature();
    void look();
    default void love() {        //same method as in father class
        System.out.println("Mother's love");
    }

    static void kindness(){
        System.out.println("Mother's kindness");
    }
}
