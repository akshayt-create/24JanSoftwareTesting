package abstractClass;

public abstract class A {

    static void main(String[] args) {
//      A a = new A();
//      a.demo3();

        demo4();
    }

    public void demo1(){        //non-static regular method (complete method)
        System.out.println("Hi");
    }

    public void demo2(){        //complete method

    }

    public abstract void demo3();   //abstract/incomplete method

    public static  void demo4(){        //static regular method

    }

//    public abstract static void demo5();
}
/*
- Abstract class is a incomplete class.
- Abstract method matlab incomplete method.
- Agar aapke class me ek bhi abstract method hai to aapka class abstract ban jayega. Matlab
  abstract methods sirf abstract class me hi reh sakti hai.
- Agar non-abstract class me abstract method rehti hai to vo error show karegi. Iskeliye
  hume ek to class ko abstract banana padega ya to method ko complete method banana padega.
--------------------------------------------------------------------------------------------------
- Hum abstract class ka object nahi bana sakte (same class me bhi aur kisi dusre class me bhi).
  Kyuki agar humne abstract class ka object bana diya to agli process me hum us object ke through
  kisi method ko call karenge aur agar humne abstract method ko call kiya to uske pass execute karne
  ke liye body hi nahi hoti isliye compiler might get confused. Isliye compiler hume abstract class
  ka object hi create nahi karne deta. Kyuki use pata hota hai ki abstract class me minimum ek abstract
  method ho sakti hai aur hum use call kar sakte hai isiliye vo compile time error show karta hai aur
  object hi create nahi karne deta (Refer line no 6). (Prevention is better than cure)
- Hum abstract class me constructor bana sakte hai, lekin hum agar abstract class ka object hi nahi
  bana sakte to us constructor ka use bhi nahi hoga. Isliye hum nahi banate hai.
- Humne constructor bana bhi diya to hum use us same class me call hi nahi kar sakte.
---------------------------------------------------------------------------------------------------
- Usi tara se hum abstract method ko static bhi nahi bana sakte. Kyuki static method ko hum direct
  call kar sakte hai. To humne static method ko jo abstract bhi hai use call kiya to uske pass
  execute karne ke liye body hi nahi rahegi, aur compiler confuse ho jayega. Isiliye compiler
  hume abstract method ko static bhi karne nahi deta aur compile time error show karta hai.
- Isiliye hum aisa keh sakte hai ki abstract method humesha non-static hi rahegi. Vo kabhibhi static
  nahi ho sakti (Refer line no 26).
-----------------------------------------------------------------------------------------------------
- Toh abstract class me non-static regular method reh sakti hai kya? Kyuki hum agar abstract class
  ka object nahi bana sakte to hum use call kaise karenge. Concrete class ke object ke through.
- To abstract class me static regular method reh sakti hai aur use call bhi kar sakte hai? --> Yes
- Isiliye regular class me hum abstract method nahi create kar sakte. Kyuki regular class ka hum object
  bana sakte hai aur us object ke through abstract method ko call bhi kar sakte hai.
------------------------------------------------------------------------------------------------------
- Hum abstract class ko aur abstract methods ko private nahi kar sakte. Kyuki abstract methods ko agar
  private (default, protected and public chalenge) kiya to use concrete class me access hi nahi milega.
  Aur hum use complete hi nahi kar payenge.
- Aur class ke condition me access specifier public ya default hi ho sakta hai.
--------------------------------------------------------------------------------------------------------
- Abstract methods with parameters wali bhi ho sakti hai.
 */