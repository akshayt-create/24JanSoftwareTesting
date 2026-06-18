package methodStudy;

public class MathOperations1 {
    static void main(String[] args) {
        //for calling static method from same class we don't need object also we don't need class name
        subtraction();

        //for calling non-static method from same class we need to create object of class
        MathOperations1 mathOperations = new MathOperations1();       //object created
        mathOperations.addition();      //non-static method called using object

        //for calling non-static method from another class we need to create object of that class
        //(Jis class ki method us class ka object)
        MathOperations2 mathOperations2 = new MathOperations2();
        mathOperations2.multiplication();

        //for calling static method from another class we don't need to create object
        //we can simply call it by using that class name
        //ClassName.methodName();   (syntax)
        MathOperations2.division();
    }

    public void addition() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum is: " + sum);

        MathOperations1 mathOperations = new MathOperations1();
        mathOperations.subtraction();
        /*
        - Matlab hum regular methods me bhi dusri regular methods ko call kar sakte hai. By creating object.
         */

        MathOperations1.subtraction();
    }

    public static void subtraction() {
        int x = 8;
        int y = 1;
        int sub = x - y;
        System.out.println("Sub is: " + sub);

        MathOperations1 mathOperations = new MathOperations1();
        mathOperations.addition();
        //Hum static method me bhi non-static regular methods ko object ke through call kar sakte hai.
    }


}
