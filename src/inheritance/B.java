package inheritance;

public class B extends A {
    int b = 20;
    static int bb = 30;

    public void displayB() {
        System.out.println("B class displayB method (non-static)");
    }

    public static void showB() {
        System.out.println("B class showB method (static)");
    }

}
