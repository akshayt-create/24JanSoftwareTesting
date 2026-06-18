package methodStudy;

public class SampleMethod {

    public void a() {    //Method declaration
        //regular non-static complete blank method

        //Method body/definition (blank body)

    }

    public void b() {    //Method declaration
        //regular non-static complete method

        //Method body/definition
        System.out.println("Hi");
        System.out.println("Hello");

    }

//    public void c();  //Method declaration
//      --> abhi ke liye java me incomplete method likhna allowed nahi hai. Isliye comment karke likha.
    //Method without body is called abstract method.

    public static void d() {    //Method declaration
        //static regular complete method

        System.out.println("Happy valentine day");
    }


    static void main(String[] args) {   //Method declaration
        //main static blank complete method

        //method body (definition)
        //how to call static methods from same class
        //call by method name only
        d();    //calling static method

    }


}
/*
    -Method declaration + Method body = Complete Method

    -Methods which do not have body are Incomplete Method
     --> public void sample();

    -Method with name 'main' is main method.

    -Main method is always complete method.

    -Any class can contain only one main method.

    -For execution, class requires main method. Class without main method cannot be executed.

    -Main method is always static.

    -Methods other than main method are regular methods.

    -Each method should be written in a class or within a scope of class.

    -If method body is empty then it is a blank method.

    -Each method should be written outside other method but within scope of class.

    -Methods with 'static' keyword are static method. And methods without static keyword
     are non-static method.
 */
