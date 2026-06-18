package constructorChaining;

public class Y extends X {      //inheritance
    /*public X(){

    }*/
    //Hum subclass me super class ka constructor nahi bana sakte.

    public Y() {
        System.out.println("User defined zero parameter constructor from Y class");
    }

    public Y(String w) {
        System.out.println("User defined string parameter constructor from Y class");
        System.out.println(w);
    }

    static void main(String[] args) {
        Y y = new Y("Core JAVA");
//        X x = new X();
    }
}
/*
- Constructor by default inherit hota hai. Aur sirf default constructor ya zero parameter
  constructor hi automatically inherit hota hai.
- Isliye super class (class X) me minimum ek zero parameter constructor rehna chahiye (default
  ya user defined). Agar vo nahi rehte hai to subclass (class Y) me error show karega inheritance
  ke bad (There is no no-arg constructor available in 'constructorChaining.X') aise.
- Isliye hum subclass (class Y) me jab bhi object create karenge (Y class ke kisi bhi constructor
  ke saath) (Refer line no 19) toh super class (class X) ka constructor (default ya zero parameter)
  automatically call hoga hi hoga.
- Toh hum aisa keh sakte hai ki line no 19 me class X ka ek mr. India chupa hoga.
  Jo hoga --> X x = new X();
- Agar ise rokna hai to zero parameter constructor ko private banana padega? Nahi aisa bhi nahi kar
  sakte. Kyuki zero parameter constructor ko private kiya to vo subclass me access hi nahi hoga aur
  subclass error show krega.
- Can constructor get inherited --> Yes
- Isliye hum subclass me bhi super class ka object create kar sakte hai. (Refer line no 20)
- Default constructor ya zero parameter constructor ek package ke sabhi classes me inherit hota hai
  (extends keyword ka use na karte hue bhi). Tabhi to hum ek class ka object dusre class me bana
  sakte hai (jis class ki method us class ka object).
- Agar humne 'extend' keyword ka use kiya to super class ka constructor call hoga hi hoga. (Ek to user
  'super' keyword se call karega, nahi to vo automatically call ho jayega.)
- Super class me ek se jayda user defined constructor hai to user un me se koi bhi constructor call kar
  sakta hai subclass me. User agar call nahi karta hai to compiler super class ka sirf default constructor
  ya user defined zero parameter constructor automatically call kar dega. Isi liye super class me minimum
  ek zero parameter constructor rehna chahiye (default ya user defined) inheritance ki case me.
--------------------------------------------------------------------------------------------------------------
- Agar hume automatic default constructor ya zero parameter ka call rokna hai to hume constructor
  chaining karni padegi 'super' keyword ka use karke. Toh super keyword ka use karke jis constructor
  ko call kiya hoga usi constructor ko call jayega aur is case me default ya zero parameter constructor
  call nahi hoga.
- Aisa islye because compiler ko super class (class X) ka minimum ek constructor lena compulsory hai
  to hum jab bhi exclusively define nahi karte the to vo by default zero parameter ya default constructor
  ko call karta tha. Agar humne exclusively call kiya hai to fir compiler usi constructor ko call
  karta hai aur default vale ko chod deta hai.
--------------------------------------------------------------------------------------------------------------
- Toh interview me aapko aisa question puch sakte hai, kya hum super class ka constructor subclass me
  call kar sakte hai kya? --> yes, kar sakte hai. Lekin hum kis type ke constructor ka call karenge, sirf
  with parameter wale constructor ko hi. Default constructor ko hum kabhi call nahi karenge kyuki hume
  output me kuch bhi nahi dikhega kyuki default constructor blank hota hai. Aur vaise bhi vo by default
  call hota hi hai agar humne chaining me specifically mention nahi kiya hai to.
 */
