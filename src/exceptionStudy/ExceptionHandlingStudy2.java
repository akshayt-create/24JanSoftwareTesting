package exceptionStudy;

public class ExceptionHandlingStudy2 {

    static void main(String[] args) {

        String a = "pune";

        try {
            System.out.println(a.charAt(-1));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Check value");

        }


    }
}
