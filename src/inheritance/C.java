package inheritance;

public class C extends B {
    int c = 40;
    static int cc = 50;

    public void displayC() {
        System.out.println("C class displayC method (non-static)");
    }

    public static void showC() {
        System.out.println("C class showC method (static)");
    }

}
