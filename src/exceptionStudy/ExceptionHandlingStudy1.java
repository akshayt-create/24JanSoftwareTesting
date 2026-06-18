package exceptionStudy;

public class ExceptionHandlingStudy1 {

    static void main(String[] args) {

        System.out.println("Hello all");

        String a = null;
//        String a = "test";

        try {
            System.out.println(a.charAt(12));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Check index");

        } catch (NullPointerException e) {
            System.out.println("Object cannot be null");

        }

        System.out.println("Good night");
    }
}

/*
- Why do we need exception handling? Why can we not handle exceptions by if-else?
 */
