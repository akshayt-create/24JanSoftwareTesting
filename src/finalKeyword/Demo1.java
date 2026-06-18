package finalKeyword;

public class Demo1 extends Demo{

    static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.test1();
        demo1.test2();
    }

    public void test1(){
        System.out.println("test1 method from Demo1 class");
    }

//    public void test2(){
//        System.out.println("test2 method from Demo1 class");
//    }
}
/*
- We cannot override final method. Kyuki overriding ek taraha ki redefining/reinitializing
  hai aur hum final elements ko reinitialized nahi kar sakte.
- To jo bhi methods final rehti hai unhe hum override nahi kar sakte. Lekin uska use kar
  sakte hai (Refer line no. 8)
---------------------------------------------------------------------------------------------
- To jab hume apni method inherit nahi hone deni hai tab use 'private' bana do.
- Par jab hume apni method ko inherit hone dena hai, par use change nahi hone dena hai, tab
  use 'final' bana do.

 */
