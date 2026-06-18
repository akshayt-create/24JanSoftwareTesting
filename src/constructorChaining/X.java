package constructorChaining;

public class X {

    public X(){
        this(10);       //Constructor chaining must be in first line only
        //this matlab isi class ka
        System.out.println("User defined zero parameterized constructor from X class");
    }

    public X(int a){
        this("Velocity");
        System.out.println("User defined integer parameter constructor from X class");
        System.out.println(a);
        System.out.println();
    }

    public X(String a){
        System.out.println("User defined string parameter constructor  from X class");
        System.out.println(a);
        System.out.println();
    }

    static void main(String[] args) {
//        X x = new X();
    }
}
/*
- Jab bhi aapko constructor chaining karni hai tab constructor me 'this' keyword ka pehala
  hi statement hona chahiye. Matlab 'this' keyword pehalihi line me hona chahiye.

- Agar humne 'this' keyword (constructor chaining) kisi aur statement ke baad likha to vo
  allowed hi nahi hai. Vo error show karega.

- Aisa isliye kyuki hum agar constructor me kisi statement ke baad constructor chaining karne
  jate hai to hum un pehale ke statements me change karne ja rahe hai aisa compiler ko lagta
  hai aur isliye vo hume allowed nahi karta hai.

- Hum ek constructor ke saath sirf ek hi dusra constructor chain kar sakte hai. Cyclic dependency
  ko avoid karne ke liye.

- Aur ek constructor me usi constructor ko call/chain nahi kar sakte. Kyuki to avoid cyclic dependency.
 */
