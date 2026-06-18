package methodStudy;

public class StaticMethod2 {
    public static void b() {
        System.out.println("Static regular method --> b from another class");
    }

    public static void c() {
        System.out.println("Static regular method --> c from another class");
    }

    public void d() {
        System.out.println("Non-static regular method --> d from another class");
    }

    public static void a() {
        System.out.println("Static regular method --> a(same name) from another class");
    }

}
