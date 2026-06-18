package accessSpecifiers;

public class A {
    private int a = 10;         //private variable
    int aa = 20;                //default variable
    protected int aaa = 30;     //protected variable
    public int aaaa = 40;       //public variable

    static void main(String[] args) {
        A a = new A();
        a.testA();      //private method called within same package
        a.testAA();     //default method called within same package
        a.testAAA();    //protected method called within same package
        a.testAAAA();   //public method called within same package

        int sum1 = 10 + a.a;        //private variable called within same package
        int sum2 = 10 + a.aa;       //default variable called within same package
        int sum3 = 10 + a.aaa;      //protected variable called within same package
        int sum4 = 10 + a.aaaa;     //public variable called within same package
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);

        //Extra
        A a1;           //object declaration
        a1 = new A();   //object initialization

        a1.testA();         //calling through object variable i.e. a1
        new A().testAA();   //calling directly by object assign value
    }

    private void testA() {
        System.out.println("A's private method testA");
    }

    void testAA() {
        System.out.println("A's default method testAA");
    }

    protected void testAAA() {
        System.out.println("A's protected method testAAA");
    }

    public void testAAAA() {
        System.out.println("A's public method testAAAA");
    }
}
