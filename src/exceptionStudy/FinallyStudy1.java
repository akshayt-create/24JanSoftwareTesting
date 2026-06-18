package exceptionStudy;

public class FinallyStudy1 {

    static void main(String[] args) {

        String a = null;
//        String a = "test";

        try {
            System.out.println(a.length());

        } finally {
            System.out.println("Finally block executed");
            System.out.println(10 / 0);
            System.out.println("bye");

        }

        System.out.println("End of code");
    }
}

/*
- Agar finally me bhi exception aata hai to finally block me jaha tak
  exception nahi hai waha tak execution ho jayega aur uske bad vo exception
  throw karega. Aur vo pehele wale exception ko override kar dega.

- Agar finally ka exception handle karna hai to hume uske andar try-catch
  likhna padega aur usko handle karna padega.

 */
