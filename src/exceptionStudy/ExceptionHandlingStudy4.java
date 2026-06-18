package exceptionStudy;

public class ExceptionHandlingStudy4 {

    static void main(String[] args) {

        String a = null;

        try {
            System.out.println(a.length());

        } catch (Exception e) {
            System.out.println("Something went wrong");

//        } catch (ArithmeticException e) {
//            System.out.println("Divide by zero is not possible");
//
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println("Check index value");
//
//        } catch (NullPointerException e) {
//            System.out.println("Check object, it should not be null");
//
        }

        System.out.println("Hello, program over");
    }
}
/*
- 'Exception' ka catch block sabhi exceptions ko handle kar sakta hai.
  Kyuki vo sabhi exceptions ka parent class hai.

- Agar 'Exception' ka catch block hum sabse pehale likhte hai to vo akela hi
  sabhi exceptions ko handle kar lega aur uske niche ke catch block useless
  ban jayenge.

- Isliye hum jab bhi 'Exception' ka catch block sabse pehale likte hai to uske
  niche ke catch blocks exception (compile time) show karte hai, kyuki unki waha
  jarurat hi nahi hoti. Vo out of reach hogaye hai ye compiler ko samaj aagaya
  aur vo exception show karta hai (Unreacheable code, already handelled).
 */
