package accessSpecifiersPackage2;

/*
- To access files from another package we need to import that package that specific file
  or all the files of that package.
- Syntax:-
  import packageName.fileName  --> for specific file
  import packageName.*         --> for all files
 */
import accessSpecifiers.A;      //importing class A of package accessSpecifiers

public class C {

    //Extra
    A a = new A();          //we can create object directly in class because it is also a one type of variables
    static A a1 = new A();  //toh agar object variable hai to hum use static bhi bana sakte hai

    int sum = 1 + a.aaaa;   //calling public variable from another package directly in the class
//  a.test4();      //we cannot access another class method directly in a class

    static void main(String[] args) {

//      a.testAAAA();
        /*
        - Humne upar direct class me hi A class ka object banaya hai lekin vo object
          main method me access nahi ho raha hai. Kyuki vo non-static hai aur main
          method static hai. (Non-static field 'a' cannot be referenced from a static
          context)
        - Isliye hume main method me A class ka dusra object create karna padega ya object
          ko hi static banana padega. (refer line no 35 and 16)
         */
        a1.testAAAA();      //calling through static object
        //Agar object ko hi static kardiya to vo instance rahega kya?

        A a2 = new A();
//      a2.testA();         //we cannot access private methods in another class
//      a2.testAA();        //we cannot access default methods in another package
//      a2.testAAA();       //we can access protected methods in same package but not in another package directly
        a2.testAAAA();      //we can access public method in another package


    }
}
