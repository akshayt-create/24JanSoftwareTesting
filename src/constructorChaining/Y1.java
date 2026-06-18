package constructorChaining;

public class Y1 extends X {
    public Y1() {
        this("Pune");       //chaining same class constructor
        System.out.println("User defined zero parameter constructor from Y1 class");
    }

    public Y1(String w) {
        super(10);               //chaining super class constructor
        System.out.println("User defined string parameter constructor from Y1 class");
        System.out.println(w);
    }

    static void main(String[] args) {

        Y1 y = new Y1();
    }
}
/*
- 'this' ki taraha 'super' ka bhi pehala hi statement hona chahiye.
--------------------------------------------------------------------------------
- Yaha pe agar hum super class (class X) ka constructor call nahi karte hai (line no 10 ko agar
  coment kar diya) to super class (class X) ka zero parameter constructor automatically call
  ho jayega.
 */
