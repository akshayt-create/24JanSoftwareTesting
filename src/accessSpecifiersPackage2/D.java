package accessSpecifiersPackage2;

import accessSpecifiers.A;      //we need to import class A

public class D extends A {      //inheritance

    static void main(String[] args) {
        A a = new A();      //we can create object with same name because we are in another class

//      a.testA();         //we cannot access private methods in another class
//      a.testAA();        //we can access default methods in same package only but not in another package

//      a.testAAA();       //we can access protected methods in another package through inheritance
        /*
        - But to call protected members from another package we need sub-class object.
          We cannot call it through that super class's object. Means through object of class A
          */
        D d = new D();     //sub-class's object created
        d.testAAA();       //calling protected method from another package through sub-class's object

        a.testAAAA();      //we can access public method in another package
        d.testAAAA();      //we can call public method through sub-class's object also
    }
}
