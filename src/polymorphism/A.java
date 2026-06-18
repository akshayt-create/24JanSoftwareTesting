package polymorphism;

public class A {

    static void main(String[] args) {
        A a = new A();
        a.addition();
        a.addition(9);
        a.addition(8.8f);
    }

    public void addition(){
        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println("Addition is " + sum);
    }

    public void addition(int a){
        int sum = a + 1;
        System.out.println("Addition2 is " + sum);
    }

    public void addition(float a){
        float sum = a + 1;
        System.out.println("Addition3 is " + sum);
    }
}
/*
- Agar ek single class me multiple methods with same method name but different parameters
  hai to use 'Method Overloading' kahenge.
-----------------------------------------------------------------------------------------------
- Ek class ki main method hum dusre class me call nahi kar sakte, kyuki jab bhi hum main
  method declare karte hai to vo usi class ke stack area ke andar jake baithti hai.
------------------------------------------------------------------------------------------------
- Objects non-static type ke hi hote hai.
 */
