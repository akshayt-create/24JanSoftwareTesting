package interfaceStudy;

public class A implements Sample2{

    static void main(String[] args) {
        A a = new A();
        a.test1();
        a.test2();
        a.test3();
        a.test4();
    }

    @Override
    public void test3() {

    }

    @Override
    public void test4() {

    }

    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }
}
/*
- 'A' class ko 'Sample1' and 'Sample2' ki methods ka access milega, kyuki
  A --> implements --> Sample2 --> extends --> Sample1
---------------------------------------------------------------------------------------
- 'A class' (implementation class) me hum main method likh sakte hai, aur A class ka object
  bhi bana sakte hai. Aur vo object sabhi methods ko call bhi kar sakta hai.
-------------------------------------------------------------------------------------------
- 'A class' hume sabhi methods ko implement karna hi padega. Nahi kiya to 'A class' ko
  abstract class banana padega.
 */
