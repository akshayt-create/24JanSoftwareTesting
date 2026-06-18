package exceptionStudy;

public class ExceptionHandlingStudy5 {

    static void main(String[] args) {

        String a = null;

        try {
            System.out.println(a.length());
            System.out.println(10 / 0);     //***

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

/*
- Agar line no 10 pe exception aata hai to compiler waha se direct uske related catch
  block pe jump karega. Aur line no 11 execute hi nahi hogi.

- Agar line no 10 pe exception nahi aata hai to hi line no 11 execute hogi.

- Jaha pe exception aata hai waha se compiler uske related catch block pe jump karta hai.

- Agar line no 11 ka exception bhi handle karna hai to use fir nested try-catch block se
  handle karna padega.
 */
