package constructorStudy;

public class B_WithDefaultConstructor {
    int a = 1;      //Global variables declaration and initialization
    int b = 2;      //Global variables declaration and initialization

    static void main(String[] args) {
        B_WithDefaultConstructor b = new B_WithDefaultConstructor();
        b.add();
    }

    public void add(){
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }
}
/*
 -Constructor ka kam hai variables ko initialized karna. Isliye jab bhi user defined constructor ayega to
  global variables ayenge hi ayenge. Kyuki global variables throughout class pata rehete hai.
 */
