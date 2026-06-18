package abstractClass;

public abstract class Demo1 {

    public Demo1() {
        System.out.println("Zero parameter constructor of Demo1");
    }

    public Demo1(int a) {
        System.out.println("Parameterised Constructor of Demo1");
        System.out.println(a);
    }

    public abstract void a1();
}
