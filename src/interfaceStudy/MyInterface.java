package interfaceStudy;

public interface MyInterface {
    int x = 10;     //by-default static and final
//    x = x + 1;

//    public MyInterface(){}

    void test();    //by-default public and abstract

//    void test1(){
//
//    }

    default void test2(){

    }

    private void  test3(){

    }

//    protected void test4(){
//
//    }

    void test5();

    static void test6(){

    }

    static void main(String[] args) {

    }

}
/*
- Interface indicated by keyword 'interface'. Class indicated by keyword 'class'.
- int x ka 'x' italic ho gaya kyuki in interface variables are by default static
  and final.
- As the variables in interface are final we can't reinitialize them. (line no 5)
- Methods in interfaces are by-default public and abstract.
- Interface me hum complete methods declare nahi kar sakte, kyuki methods in interfaces
  are by default abstract. Aur abstract methods ko hum body nahi de sakte. (line no 9)
- Lekin jab hum methods ka access modifier default aur private likhte hai tab hum us
  method ko body de sakte hai.
- Par method ko private karke bhi kuch fayda nahi hai, kyuki hum us method ko implementation
  class me access hi nahi kar payenge.
- Protected access modifiers is not allowed in interfaces.
- Hum interfaces me multiple methods bana sakte hai, lekin vo sari ki sari methods
  abstract (incomplete) hi hogi.
-------------------------------------------------------------------------------------------
- Hum interface ka object nahi create kar sakte. Kyuki object se hum methods call karte hai
  aur interfaces me all methods abstract (incomplete) hi hoti hai, to jab hum un methods ko
  call karenge to unke pass execute karne ke liye body hi nahi hogi aur compiler may get
  confused. To vo hume object create karne ke liye allow hi nahi karta hai.
- Hum kahipe bhi interface ka object nahi bana sakte.
- Vaise hi hum interfaces me constructor bhi create nahi kar sakte. (line no 7)
--------------------------------------------------------------------------------------------
- Isliye hum interface ke andar kabhi bhi main method nahi likhte hai (Likh nahi sakte aisa
  nahi hai hum likh sakte hai, refer line no 33). Kyuki all methods are abstract (non-static)
  aur hum kabi bhi interface ka object nahi bana sakte.
 */
