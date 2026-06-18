package exceptionStudy;

public class ExceptionHandlingStudy {

    static void main(String[] args) {

        System.out.println("hi");

        try {
            System.out.println(10 / 0);     //risky code

        } catch (ArithmeticException e) {
            System.out.println("Number cannot divide by Zero");

        }

        System.out.println("hello");


    }
}
