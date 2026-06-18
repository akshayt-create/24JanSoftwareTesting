package exceptionStudy;

public class ExceptionHandlingStudy3 {

    static void main(String[] args) {

        String a = null;

        try {
            System.out.println(a.length());

        } catch (ArithmeticException e) {
            System.out.println("Divide by zero is not possible");

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Check index value");

        } catch (NullPointerException e) {
            System.out.println("Check object, it should not be null");

        } catch (Exception e) {
            System.out.println("Something went wrong");

        }

        System.out.println("Hello, program over");
    }
}
