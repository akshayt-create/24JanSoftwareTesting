package methodStudy;

public class NonStaticMethods1 {
    static void main(String[] args) {
        //to call non-static method, we need object of class
        NonStaticMethods1 nonStaticMethods1 = new NonStaticMethods1();

        //objectName.methodName (syntax)
        nonStaticMethods1.myMethod();   //called non-static method from same class

        //to call non-static method from another class we need to create object of that class
        //(Jis class ki method us class ka object)
        NonStaticMethod2 nonStaticMethod2 = new NonStaticMethod2();     //object of another class is created
        nonStaticMethod2.myMethod2();       //non-static method called from another class
    }

    public void myMethod() {     //non-static regular method
        System.out.println("Non static myMethod1");
    }
}
