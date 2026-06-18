package accessSpecifiers;

public class B {
    A a1;        //making object as a global variable

    static void main(String[] args) {
        A a = new A();      //created object of A class
        //alag class me hum same name ka object bana sakte hai (refer class A line no 10)

//      a.testA();        //we cannot access private method in another class
        a.testAA();       //calling default method in another class B within same package
        a.testAAA();      //calling protected method in another class B within same package
        a.testAAAA();     //calling public method in another class B within same package

//      int sum1 = 10 + a.a;        //we cannot access private variable in another class
        int sum2 = 10 + a.aa;       //default variable called in another class B but within same package
        int sum3 = 10 + a.aaa;      //protected variable called in another class B but within same package
        int sum4 = 10 + a.aaaa;     //public variable called in another class B but within same package
//      System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);

        //Extra
        A aa;           //object declaration
        aa = new A();   //object initialization

        aa.testAAA();       //calling through object reference variable i.e. aa
        new A().testAAA();  //calling directly through assigning value of object

    }

    public void test1(){
        //we don't need to create object here because we declare a1 as a global object (line no 4)
        System.out.println(a1.aa);      //accessing 'aa' via global object????
    }
}
