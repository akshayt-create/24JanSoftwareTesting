package inheritance;

public class MultiLevelInheritance {

    static void main(String[] args) {
        B b = new B();
        b.displayB();       //calling B class method
        b.displayA();       //calling A class method using B class object because (B extends A)

        //C extends B extends A
        C c = new C();
        c.displayA();       //calling A class method using C class object because (C extends B extends A)
        c.displayB();       //calling B class method using C class object because (C extends B)
        c.displayC();       //calling C class method

        C.showA();       //calling A class static method using C class reference because (C extends B extends A)
        C.showB();       //calling B class static method using C class reference because (C extends B)
        C.showC();       //calling C class static method

        int sum1 = 10 + c.a;        //calling A class instance variable using C class object
        System.out.println(c.b);    //calling B class instance variable using C class object
        int sum3 = 10 + c.c;        //calling C class instance variable using C class object

        System.out.println(C.aa);   //calling A class static variable using C class reference
        System.out.println(C.bb);   //calling B class static variable using C class reference
        System.out.println(C.cc);   //calling C class static variable using C class reference

        int sub = 100 - c.a - C.bb;     //for clarity

    }
}
//Object class is super class of all classes
