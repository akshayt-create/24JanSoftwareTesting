package polymorphism;

public class B extends A{

    static void main(String[] args) {
        B b = new B();
        b.addition();

        A a = new A();
        a.addition();

    }

    public void addition(){
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Addition is " + sum);

    }
}
/*
- Implementing super class method in subclass with the same method name and same
  arguments is 'Method Overriding'.
- Super class ki method hai vaisi hi method subclass me bhi honi chahiye (with same
  name and same parameters) tab use method overriding kahenge.
- Method overriding ke liye inheritance concept compulsory hai.
-------------------------------------------------------------------------------------------------
- Agar is class me (class B me) addition (same name) ki method nahi hoti to 'b' object se addition
  call kiya to vo A class ki method ko jata. (Refer line no. 6)
- Matlab jab bhi methods override hue hai tab super class ki method ko call karni hai ya
  subclass ki method ko call karni hai ye object ke uper depend karega (refer line no. 7
  and 10) (jis class ka object us class ki method call hogi).
- Aisa isliye dono class me method name and unke parameters same hai. To hum unme class ke
  object ke through differentiate karte hai.
 */
