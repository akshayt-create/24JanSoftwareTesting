package exceptionStudy;

public class FinallyStudy2 {

    static void main(String[] args) {

        try {
            System.out.println(10 / 0);

        } catch (NullPointerException e) {
            System.out.println("Object should not be null");

        } catch (ArithmeticException e) {
            System.out.println("Divide by zero is not possible");

        } catch (Exception e) {
            System.out.println("Something went wrong");

        } finally {
            System.out.println("finally block executed");

        }

        System.out.println("Bye");
    }
}

/*
- Yaha pe line no 24 hamesha execute hogi kyuki humne exceptions handle
  kiye hai.
 */
