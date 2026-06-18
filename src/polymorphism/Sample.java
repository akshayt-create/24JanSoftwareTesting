package polymorphism;

public class Sample {

    static void main(String[] args) {
        a(10);

    }

    public void a(){
        System.out.println("non-static method a");
    }

    public static void a(int x){
        System.out.println("Static method with int parameter " + x);
    }
}
