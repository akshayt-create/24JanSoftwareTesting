package abstractClass;

public abstract class C2 extends B {
    static void main(String[] args) {
//        C2 c2 = new C2();
//        c2.show1();          //method of B class
//        c2.show2();          //method of B class
//        c2.show3();          //method of C class
//        c2.show4();          //method of C class
//        c2.show5();          //method of C class
//        c2.show6();          //method of C class

        /*
        - C2 ko abstract method declare kiya to uska object creation fail
          ho gaya.
         */

    }

    @Override
    public void show3() {

    }

    public void show4() {

    }

    public void show5() {

    }

    public void show6(){

    }

}
/*
- Abhi humne C2 class ko bhi abstract bana diya to iska bhi ek concrete class banana
  padega.
- Toh abhi hum iska (C2 class ka) bhi object nahi bana sakte. (Refer line 5)
- C2 class ko abstract class banaya hai isliye vo B class ki show7 (abstract method)
  method ko usme (C2 class me) impliment nahi kiya hai tobhi vo error show nahi karega.
- Agar C2 class ka abstract word hata dete hai to vo error show karega, kyuki humne usme
  show7 method (abstract method of class B) ko impliment nahi kiya hai.
- Abhi hum C2 class me uski abstract methods bana sakte hai. Kyuki humne use abstract
  class bana diya hai.
 */
