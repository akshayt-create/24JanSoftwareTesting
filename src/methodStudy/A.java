package methodStudy;

public class A {
    static void main(String[] args) {
        //calling static method from same class
        test3();

        //To call non-static regular methods we need to create object of a class
        //ClassName objectName = new ClassName();
        A a = new A();  //object created

        //to call non-static method from same class
        //objectName.methodName();
        a.test1();      //non-static method called from same class
        a.test2();      //non-static method called from same class

        //To call non-static regular methods from another class we need to create object of that class
        NonStaticMethods1 nonStaticMethods1 = new NonStaticMethods1();      //object created
        nonStaticMethods1.myMethod();       //non-static method called using object name

    }

    public void test1(){
        System.out.println("Non-static method test1 from class A");
    }

    public void test2(){
        System.out.println("Non-static method test2 from class A");
    }

    public static void test3(){
        System.out.println("Static method test3 from class A");
    }
}
