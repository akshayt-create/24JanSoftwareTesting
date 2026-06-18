package constructorStudy;

public class A {

//   public A(){
//       default constructor
//    }

    public A(){
        //User defined constructor (zero parameter)
    }

    public A(int a){
        //User defined constructor (single parameter)
    }

    public A(int a, int b){
        //User defined constructor (two parameters)
    }

    public A(float a){
        //User defined constructor (single parameter)
    }


    static void main(String[] args) {
        //class type ke variable ko object kehate hai
        A a = new A();
        A a1 = new A(20);
    }


}
/*
 -Constructor is a special method (kyuki iska name class ke name jaisa hota hai).
 -Constructor's name must be same as class name.
 -default constructor --> provided by compiler, jab user khudka constructor define nahi karta hai.
 -When user create objects, then compiler creates default constructor (jab user khudka constructor nahi
  banata hai, tab compiler khud ek constructor banata hai background me).
 -Jab user khudka constructor banata hai, tab compiler dekhta hai ab mujhe constructor banane ki jarurat nahi
  hai to vo nahi banata hai.
 -Constructor hum sirf non-static methods ke liye banate hai.
 -Constructor khud non-static hota hai, vo static nahi ho sakta.
 -Constructor ko kabhi bhi return type nahi hota hai.
 -Ek class me multiple constructor create kar sakte hai, aur un sabka name same hi rahega exact class ke
  name jaisa. But unke parameters alag alag rahenge constructor duplicate na ho isliye.
 -Constructor will be called automatically, when we create object.
 -Agar class me multiple constructor hai to, object create karte time jis constructor ko call kiya hai,
  us constructor ko call jayega.
 -Ek object ke saath hum ek hi constructor call kar sakte hai. Dusra constructor call karna hai to hume dusra
  object create karna padega.
 -Constructor se operations perform kar sakte hai, par vo recommended nahi hai kyuki vo methods ka kam hai.
 -Constructor ko dusre class me call nahi kar sakte, methods ko dusre class me call kar sakte hai.
 -CONSTRUCTOR OVERLOADING:- Jab ek class me same name ke ek se jayda constructor hote hai to use constructor
  overloading kehete hai.
 -Constructor ko mainly non-parameterised methods ke liye use kiya jata hai.
 */